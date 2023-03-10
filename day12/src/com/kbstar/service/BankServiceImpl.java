/**
 * 
 */
package com.kbstar.service;

import java.util.List;

import com.kbstar.dao.AccountDAO;
import com.kbstar.dao.TransactionDAO;
import com.kbstar.dao.UserDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.BankService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.MakeAccountNumber;
import com.kbstar.frame.Notification;
import com.kbstar.noti.NotificationImpl;

/**
 * @author pc
 *
 */
public class BankServiceImpl implements BankService<UserDTO, AccountDTO, TransactionDTO, String, String> {
	
	DAO<String, UserDTO> userDao;
	DAO<String, AccountDTO> accountrDao;
	DAO<String, TransactionDTO> transactionDao;
	Notification notification;
	
	public BankServiceImpl() {
		userDao = new UserDAO();
		accountrDao = new AccountDAO();
		transactionDao = new TransactionDAO();
		notification = new NotificationImpl();
	}

	@Override
	public void register(UserDTO v) throws Exception {
		try {
			userDao.insert(v);
		} catch (Exception e) {
			throw new Exception("등록 오류");
		}
		notification.sendEmail(v.getEmail(), "축하합니다.");
		notification.sendSMS(v.getContact(), "축하합니다.");
	}

	@Override
	public UserDTO login(String K, String p) throws Exception {
		UserDTO user = null;
		user = userDao.select(K);
		if(user != null) { 
			if(user.getPwd().equals(p)) {     // DB의 pwd 와 내가 입력한 pwd 비교
				System.out.println("OK");
			} else { 
				throw new Exception("로그인 실패..."); // DB의 pwd 와 내가 입력한 pwd 가 다른 경우
			}
		} else {
			throw new Exception("로그인 실패..."); // DB에 해당 ID가 존재하지 않는 경우
		}
		return user;
	}

	@Override
	public UserDTO getUserInfo(String k) throws Exception {
		UserDTO user = userDao.select(k);
		return user;
	}

	@Override
	public void makeAccount(String k, double balance) throws Exception {
		String accNo = MakeAccountNumber.makeAccNum(); // 계좌번호 생성
		AccountDTO account = new AccountDTO(accNo, balance, k);	// 계좌번호, balance, ID	
		accountrDao.insert(account);
		UserDTO user = userDao.select(k); // 고객 정보 호출
		notification.sendEmail(user.getEmail(), accNo+"계좌를 생성하셨습니다.");
		notification.sendSMS(user.getContact(), accNo+"계좌를 생성하셨습니다.");
	}

	@Override
	public List<AccountDTO> getAllAccount(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TransactionDTO> getAllTr(String acc) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void transaction(String sendAcc, String receiveAcc, double balance, String desc) throws Exception {
		System.out.println("금결원 전송..");
		// 계좌 정보 수정
		// 계좌 잔액 정보를 조회하고 잔액에서 이체 금액 차감한 잔액으로 수정
		AccountDTO acc = null;
		acc = accountrDao.select(sendAcc); // 내 계좌정보 조회
		double abalance = acc.getBalance() - balance; // 잔액에서 이체 금액 차감
		acc.setBalance(abalance); 
		accountrDao.update(acc); // 잔액에서 이체 금액 차감한 잔액으로 수정
		// 거래 내역 추가
		TransactionDTO tr = new TransactionDTO(MakeAccountNumber.makeTrNum(), sendAcc, abalance, "O", desc);
		transactionDao.insert(tr);
		// SMS, email 전송
		String uid = acc.getHolder();
		UserDTO u = userDao.select(uid);
		notification.sendEmail(u.getEmail(), sendAcc+" 계좌에서 "+balance+"원 출금되었습니다.");
		notification.sendSMS(u.getContact(), sendAcc+" 계좌에서 "+balance+"원 출금되었습니다.");
		// 완료
		System.out.println("거래 후 잔액은 "+acc.getBalance()+"원입니다.");
		
	}


}

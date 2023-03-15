package com.kbstar.service;

import java.util.List;

import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.BankService;

public class BankServiceImpl implements BankService<UserDTO, AccountDTO, TransactionDTO, String, String>{
	/**
	 * String id
	 * String pwd
	 */
	
	
	@Override
	public void register(UserDTO v) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserDTO login(String K, String p) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO getUserInfo(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void makeAccount(String k, double balance) throws Exception {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
	}

}

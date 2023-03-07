package ws0307;

public class Account {
	private String accNo;
	private String name;
	private String accHolder;
	private double balance;
	
	// Constructor - 음수 예외 상황
	// 계좌 정보 조회
	public Account() {
		this.accNo = MakeAccountNumber.makeAccNo();
	}
	public Account(String name, String accHolder, double balance) throws negativeNumException  {
		this();
		if (balance <= 0) {
			throw new negativeNumException("금액을 확인하세요.");
		}
		this.name = name;
		this.accHolder = accHolder;
		this.balance = balance;
	}
	public Account(String accNo, String name, String accHolder, double balance) throws negativeNumException {
		if (balance <= 0) {
			throw new negativeNumException("금액을 확인하세요.");
		}
		this.accNo = accNo;
		this.name = name;
		this.accHolder = accHolder;
		this.balance = balance;
	}
	public String getAccNO() {
		return accNo;
	}
	public String getName() {
		return name;
	}
	public String getAccHolder() {
		return accHolder;
	}
	
	// 잔액 조회
	public double getBalance() {
		return balance;
	}
	
	// 입금 - 음수 예외 상황
	public void deposit(double money) throws negativeNumException {
		if (money <= 0) {
			throw new negativeNumException("금액을 확인하세요.");
		} 
		this.balance += money;
	}
	
	// 출금 - 잔액 부족 예외 상황, 음수 예외 상황
	public void withdraw(double money) throws negativeNumException, OverdrawnException {
		if (money <= 0) {
			throw new negativeNumException("금액을 확인하세요.");
		} 
		if (money > this.balance) {
			throw new OverdrawnException("잔액이 부족합니다.");
		} this.balance -= money;
	}
	
	@Override
	public String toString() {
		return "Account [accNO=" + accNo + ", name=" + name + ", accHolder=" + accHolder + ", balance=" + balance + "]";
	}
	
}

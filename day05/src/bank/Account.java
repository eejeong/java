package bank;

public class Account {
	private String accNum;
	private String accName;
	private double balance;
	public Account() {
//		MakeAccountNumber makenum = new MakeAccountNumber();
//		this.accNum = makenum.makeAccNum();
		this.accNum = MakeAccountNumber.makeAccNum();   // static 사용시, 함수만 가져와서 사용 가능
	}
	
	public Account(String accName, double balance) {
		this();
		this.accName = accName;
		this.balance = balance;
	}
	public Account(String accNum, String accName, double balance) {
		this.accNum = accNum;
		this.accName = accName;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", accName=" + accName + ", balance=" + balance + "]";
	}
	
	public double getBalance() {
		return balance;    // 잔액 조회
	}
	
	public void withdraw(double money) {
		if(money <= 0) {	
			System.out.println("출금 금액을 확인하세요");	
			return;
		}
		if(this.balance < money) {	
			System.out.println("잔액이 부족합니다.");	
			return;
		}
		this.balance -= money;
	}
	
	public void deposit(double money) {
		if(money <= 0) {
			System.out.println("입금 금액을 확인하세요");
			return;
		}
		this.balance += money;
	}
}

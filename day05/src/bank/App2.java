package bank;

import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Account acc = null;                    // reference 타입 초기화. while문 안에서 초기화할 경우, 계좌개설 후 다른 거래시 초기화됨
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Input Command(c,w,d,s,q).."); // 계좌개설, 출금, 입금, 조회, 종료
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Bye...");
				break;
			} else if(cmd.equals("c")) {
				System.out.println("Create Account");
				System.out.println("Input Account Info[name,balance]");	
				
				System.out.println("Input Name:");	
				String name = sc.next();
				System.out.println("Input Balance:");	
				double balance = Double.parseDouble(sc.next());	
				
				acc = new Account(name, balance);
				System.out.println(acc);	
				
			} else if(cmd.equals("w")) {
				System.out.println("Widthdraw");
				System.out.println("Input Widthdraw money");	
				double money = Double.parseDouble(sc.next());	
				acc.withdraw(money);
				System.out.println(acc);
				
			} else if(cmd.equals("d")) {
				System.out.println("Deposit");
				System.out.println("Input Deposit money");	
				double money = Double.parseDouble(sc.next());	
				acc.deposit(money);
				System.out.println(acc);
				
			} else if(cmd.equals("s")) {
				System.out.println("Select:");
				System.out.println(acc);	
			}
		}
		sc.close();
	}

}

package ws0307;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Account acc = null;
		Scanner sc = new Scanner(System.in);

		// 계좌 생성
		while (true) {
			System.out.println("Input Command(c,w,d,s,q)..");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("종료합니다.");
				break;
			} else if (cmd.equals("c")) {
				System.out.println("Create Account");
				System.out.println("Input Name:");
				String name = sc.next();
				System.out.println("Input accHolder:");
				String accHolder = sc.next();
				System.out.println("Input Balance:");
				double balance = Double.parseDouble(sc.next());
				try {
					acc = new Account(name, accHolder, balance);
					System.out.println(acc);
				} catch (negativeNumException e) {
					System.out.println(e.getMessage());
				}

			} // 계좌 정보 조회
			else if (cmd.equals("s")) {
				System.out.println("Select:");
				System.out.println(acc);

			} // 계좌 입금
			else if (cmd.equals("d")) {
				System.out.println("Deposit");
				System.out.println("Input Deposit money");
				double money = Double.parseDouble(sc.next());
				try {
					acc.deposit(money);
					System.out.println(acc);
				} catch (negativeNumException e) {
					System.out.println(e.getMessage());
				}

			} // 계좌 출금
			else if (cmd.equals("w")) {
				System.out.println("Widthdraw");
				System.out.println("Input Widthdraw money");
				double money = Double.parseDouble(sc.next());
				try {
					acc.withdraw(money);
					System.out.println(acc);
				} catch (OverdrawnException | negativeNumException e) {
					System.out.println(e.getMessage());
				}
			}

		}
		sc.close();
	}
}

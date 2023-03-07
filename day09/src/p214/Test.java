package p214;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input num ...");
		int num = 0;  // 변수 선언을 try, catch 구문 밖에서 해야 결과까지 적용됨
		
		try {
			num = Integer.parseInt(sc.next());
			int result = 10 / num;		
			System.out.println(result);
		} catch (ArithmeticException e1) {
			System.out.println("분모가 0입니다.");
			return;
		} catch (NumberFormatException e2) {
			System.out.println("숫자를 입력하세요.");
			return;
		} finally {
			System.out.println("반드시 실행....");
			sc.close();
		}

		System.out.println("End Application .......");
	}

}

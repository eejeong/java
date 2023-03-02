package board;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Service service = new Service();
		while(true) {
			System.out.println("Input cmd(r,m,d,g,q)"); // 등록, 편집, 삭제, 조회, 종료
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Bye.");
				break;
			} else if(cmd.equals("r")) {
				System.out.println("Input contents");
				String content = sc.next();
				service.register(content);
			} else if(cmd.equals("g")) {
				System.out.println("Input number");
				int num = Integer.parseInt(sc.next());
				String result = service.get(num);
				System.out.println(result);
			} else if(cmd.equals("m")) {
				System.out.println("Input number & content");
				int num = Integer.parseInt(sc.next());
				String content = sc.next();
				service.modify(num, content);
			} else if(cmd.equals("d")) {
				System.out.println("Input number");
				int num = Integer.parseInt(sc.next());
				service.remove(num);
			}
		}
		sc.close();
	}

}

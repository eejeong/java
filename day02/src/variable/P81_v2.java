package variable;

import java.util.Scanner;

import com.sun.net.httpserver.Authenticator.Result;

public class P81_v2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("숫자를 입력하십시오");
	    int Num = Integer.parseInt(sc.next());
	    String result = (Num > 0) ? "정상" : "비정상";
	    System.out.println(result);
	    sc.close();
	}

}
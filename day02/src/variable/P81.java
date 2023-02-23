package variable;

import java.util.Scanner;

import com.sun.net.httpserver.Authenticator.Result;

public class P81 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("숫자를 입력하십시오");
	    String cmd = sc.next();
	    int Num = Integer.parseInt(cmd);
	    String result;
	    if(Num > 0) {
	    	result = "정상";
	    } else {
	    	result = "비정상";
	    }
	    System.out.println(result);
	    sc.close();
	}

}
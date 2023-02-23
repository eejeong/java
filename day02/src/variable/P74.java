package variable;

import java.util.Random;
import java.util.Scanner;

public class P74 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("숫자를 입력하십시오(10~100)");
	    String cmd = sc.next();
	    // 10~100 사이의 정수를 입력 받는다.
	    // 1부터 입력받은 숫자까지의 범위에서 랜덤한 숫자를 발생하시오
		Random r = new Random();
	    int Num = Integer.parseInt(cmd); // cmd는 string이기 때문에, 정수로 변경해야함 
		int rndNum = r.nextInt(Num)+1; // (Num)은 0~(Num-1). +1 해줘야 1~Num 범위
		System.out.println(rndNum);
			    sc.close();
	}
}

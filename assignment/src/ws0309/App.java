package ws0309;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Lotto lotto = new Lotto(); // 로또 클래스 호출
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> lottoNum = new ArrayList<Integer>();
		
		System.out.println("25 이하의 숫자 3개를 입력해주세요.");
	
	
		for(int i = 0; i < 3; i++) {
			int num = Integer.parseInt(sc.next());
			if(num > 25 || num <= 0) {
				System.out.println("잘못된 번호입니다.");
				sc.close();
				return;
			}
			lottoNum.add(num);
		}
		
		int grade = lotto.checkRanking(lottoNum);
		double prizeMoney = Math.floor(lotto.prizeMoney(lottoNum));
		System.out.println("winningNum = " + lotto.getWinningNum());
		System.out.printf("축하합니다! %d등에 당첨되셨습니다!\n당첨금은 %s원입니다.", grade, prizeMoney);
		
		sc.close();
	}

}

package lotto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Lotto {
		private HashSet<Integer> winningNum;
		private double prizeMoney;
		public Lotto() {
			winningNum = new HashSet<Integer>();
		}
		public Object getPrizeMoney() {
			return null;
		}
		
		// 번호 생성, 당첨금 생성
		public void makeWinningNumberMoney() {
			Random r = new Random();
			prizeMoney = r.nextInt(2000000000)+1;
			while(winningNum.size() <3) {
				int num = r.nextInt(25)+1;
				winningNum.add(num);
			}
			System.out.printf("%4.0f\n",prizeMoney);
			System.out.println(winningNum.toString());
		}
		
		// 당첨 번호와 내 번호 비교
		public int checkRanking(ArrayList<Integer> myNum) throws Exception {
			int grade = 0;
			int cnt = 0;
			// 5 7 9
			for(int num : myNum) {
				// 5 7 10
				for(int prizeNum : winningNum) {
					if(num == prizeNum) {
					cnt++;
					}
				}
			}
			switch (cnt) {
			case 3: grade = 1; break;
			case 2: grade = 2; break;
			case 1: grade = 3; break;
			default: throw new Exception("꽝!");

			}
			return grade;
		}
		
		// 등수별 당첨금
		public double prizeMoney(int grade) {
			double pMoney = 0.0;
			switch (grade) {
			case 1: pMoney = prizeMoney * 0.7; break;
			case 2: pMoney = prizeMoney * 0.2; break;	
			case 3: pMoney = prizeMoney * 0.1; break;	
			default: pMoney = 0.0;
			}
			return pMoney;
		}		
}

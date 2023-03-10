package ws0309;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Lotto { 
	private HashSet<Integer> winningNum = new HashSet<>();
	private double prizeMoney;
	public Lotto() {
        makeWinningNumberMoney();
	}
	public HashSet<Integer> getWinningNum() {
		return winningNum;
	}
	public double getPrizeMoney() {
		return prizeMoney;
	}

	// 당첨 번호와 당첨금 생성
	public void makeWinningNumberMoney() {
		Random r = new Random();
		while(winningNum.size() < 3) {
			winningNum.add(r.nextInt(25)+1);
		} 
		// test
		// System.out.println("winningNum =" + winningNum); 
		prizeMoney = r.nextInt(2000000000)+1; 
		// test
		// System.out.printf("prizeMoney = %s \n", prizeMoney);
	}         

	// 본인이 입력한 숫자 3개를 입력하여 몇개가 일치하는지 check 한 후, 등수 리턴
    public int checkRanking(ArrayList<Integer> myNum) {
        int cnt = 0;
        int grade = 0;
        for (Integer a : winningNum) {
            for (Integer b : myNum) {
                if (a == b) {
                    cnt++;
                }
            }
        }
        grade = 4 - cnt;
        return grade;
    }
    
    // 당첨금 리턴    
    public double prizeMoney(ArrayList<Integer> myNum) {
    		int grade = checkRanking(myNum);
    		double result = 0.0;
    		switch(grade) {
    			case 1: {
    				result = prizeMoney * 0.6;
    				break;
    			}
    			case 2: {
    				result = prizeMoney * 0.3;
    				break;
    			}
    			case 3: { 
    				result = prizeMoney * 0.1;
    				break;
    			}
    			default : {
    				result = 0;
    				break;
    			}
    		}
    		return result;
    }		
    
	// 당첨 번호와 당첨금 출력
	public String toString() {
		return "Lotto 당첨번호는 " + winningNum + "당첨금은 " + prizeMoney + "입니다.";
	}
}

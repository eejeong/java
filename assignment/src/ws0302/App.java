package ws0302;
/*Account 클래스가 다음과 같이 설계 되어 있다.
Account 클래스를 구현 하시오
단, 계좌 번호는 자동 생성 한다.(MakeAccountNumber 이용)
기능, 입금, 출금, 현재이자금액
App.java를 통해 Application 을 구현 하시오
1. 6개의 Account 객체 배열을 만들어 다음과 같은 객체를 입력 한다.
new Account("james1", 10000, 0.35, "VIP");
new Account("james2", 10000, 0.45, "GOLD");
new Account("james3", 10000, 0.55, "SIVER");
new Account("james4", 10000, 0.15, "GOLD");
new Account("james5", 10000, 0.28, "SIVER");
new Account("james6", 10000, 0.31, "VIP");
2. 6개의 계좌 정보를 출력 하시오
3. 모든 계좌의 잔액과 현재 이자금액을 출력 하시오
4. VIP들의 잔액의 합과 평균으을 출력 하시오 */

public class App {

	public static void main(String[] args) {
		Account accList[] = new Account[6];
		accList[0] = new Account("james1", 10000, 0.35, "VIP");
		accList[1] = new Account("james2", 10000, 0.45, "GOLD");
		accList[2] = new Account("james3", 10000, 0.55, "SIVER");
		accList[3] = new Account("james4", 10000, 0.15, "GOLD");
		accList[4] = new Account("james5", 10000, 0.28, "SIVER");
		accList[5] = new Account("james6", 10000, 0.31, "VIP");
		
		double sum = 0.0;
		double avg = 0.0;
		int cnt = 0;
		
		for(Account acc:accList) {
			System.out.println(acc);
			System.out.printf("해당 계좌의 잔액은 %4.2f원이고, 현재 이자금액은 %4.2f원입니다.\n",acc.getBalance(), acc.getInterest());
			if(acc.getGrade().equals("VIP")) {
				sum += acc.getBalance();
				cnt ++;
			}
				
		}
		avg = sum / cnt; 
		System.out.printf("\nVIP 고객의 잔액의 합은 %4.2f원이고, 평균 잔액은 %4.2f원입니다.", sum, avg);
	} 

}

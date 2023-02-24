package whilecontrol;

public class P94 {

	public static void main(String[] args) {
		// 합과 평균을 구하시오
		// 짝수만 구하시오
		// i%2 == 0
		int sum = 0;
		double avg = 0.0;
		
		System.out.println("Start...");
		int cnt = 0;
		for(int i=1 ; i<=100 ; i++) {
			if(i%2 == 0) {
				sum += i;
				cnt++; 
			}
			if(i == 80) {
				break;
			}
		}
		avg = sum / (cnt*1.0); // i의 범위가 변경되었을 때, avg 값이 실수가 될 수 있으므로 cnt를 실수로 바꾸는 작업
		System.out.printf("%d, %f \n", sum, avg);
		System.out.println("End..."+cnt);	
	}
}
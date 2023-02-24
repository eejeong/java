package ifcontrole;

public class ws2 {

	public static void main(String[] args) {
		// 1 ~ 100까지의 숫자 중
		// 1. 3의 배수의 합과 평균을 구하시오.
		// 2. 4의 배수의 합과 평균을 구하시오.
		// 3. 7의 배수의 합과 평균을 구하시오.
		int i = 1;
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		double avg1 = 0.0;
		double avg2 = 0.0;
		double avg3 = 0.0;
		
		while(i <= 100) {
			if(i%3 == 0) {
				sum1 += i;
				cnt1++;
			}
			i++;
		}
        i = 1;
		avg1 = (sum1*1.0)/cnt1;
		
		while(i <= 100) {
			if(i%4 == 0) {
				sum2 += i;
				cnt2++;
			}
			i++;
		}
        i = 1;
		avg2 = (sum2*1.0)/cnt2;
		
		while(i <= 100) {
			if(i%7 == 0) {
				sum3 += i;
				cnt3++;
			}
			i++;
		}
        i = 1;
		avg3 = (sum3*1.0)/cnt3;
		
		System.out.printf("sum = %d, avg = %4.2f \n", sum1, avg1);
		System.out.printf("sum = %d, avg = %4.2f \n", sum2, avg2);
		System.out.printf("sum = %d, avg = %4.2f \n", sum3, avg3);
	}

}

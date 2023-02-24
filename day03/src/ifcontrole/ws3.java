package ifcontrole;

public class ws3 {

	public static void main(String[] args) {
		// 1 ~ 100까지의 숫자 중
		// 1. 3의 배수의 합과 평균을 구하시오.
		// 2. 4의 배수의 합과 평균을 구하시오.
		// 3. 7의 배수의 합과 평균을 구하시오.
		int i = 0;
		int cnt = 0;
		int sum = 0;
		double avg = 0;
		
		switch (i) {
		case 1:
			if(i%3 == 0) {
				sum += i;
				cnt++;
				avg = (sum*1.0)/cnt;
				System.out.printf("sum = %d, avg = %4.2f \n", sum, avg);
				break;
			} 
		case 2:
			if(i%4 == 0) {
				sum += i;
				cnt++;
				avg = (sum*1.0)/cnt;
				System.out.printf("sum = %d, avg = %4.2f \n", sum, avg);
				break;
			}
		case 3:
			if(i%7 == 0) {
				sum += i;
				cnt++;
				avg = (sum*1.0)/cnt;
				System.out.printf("sum = %d, avg = %4.2f \n", sum, avg);
				break;
			}
		}
	}
	}

package array;

import java.util.Arrays;
import java.util.Random;

public class P104 {

	public static void main(String[] args) {
	
		int arr[] = new int[10];
		Random r = new Random();
		
		for(int i=0; i< arr.length ; i++) { 
			arr[i] = r.nextInt(99)+1; // 1부터 99 cf.(99)는 0~98
		}
		
		System.out.println(Arrays.toString(arr));
		
		// 배열의 합과 평균을 구하시오.
		int sum = 0;
		double avg = 0.0;
		
		for(int a:arr) {
			sum += a;
		}
		avg = sum/ (arr.length * 1.0);
		
		System.out.printf("sum = %d, avg = %4.2f \n", sum, avg);
	}
}
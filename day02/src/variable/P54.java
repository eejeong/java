package variable;

public class P54 {

	public static void main(String[] args) {
		//boolean
//		boolean b1 = 10 > 5;

		// 정수
//		int n1 = 10;
//		long n2 = 0L;
//		n2 = 222222222222L;
		
		// 실수
//		double d1 = 1.0;
//		float f1 = 1.0F;
		
		double d2 = 1/2;
		System.out.println(d2);
		
		double d3 = 10.0/3.0;
		System.out.println(d3);  // double는 소수점 15자리 3.3333333333333335
		
		float f2 = 10.0F/3.0F;
		System.out.println(f2);  // float는 소수점 7자리 3.3333333
		
		// char
		char c1 = 'A';
		System.out.println(c1);		
		
		char c2 = 65;            // 유니코드표 65 = A
		System.out.println(c2);		
		
		int n3 = 10;
		double n4 = 10.0;
		double result = n3 + n4; // double값을 int로 변경할 경우, 값이 달라질 수 있으므로 합계값을 double로 변경
	}

}

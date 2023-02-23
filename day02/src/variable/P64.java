package variable;

public class P64 {

	public static void main(String[] args) {
		int a = 10;
		double d = 10.2345;
		String str1 = "abc";
		String str2 = "abc";	
		str1 = "def";
		System.out.printf("%d\t%4.2f\t%s \n",a,d,str1, str2); 
		// %4.2f는 소수점 앞자리 4자리, 소수점 뒤 2자리 출력. but 앞자리가 4자리 이상인 경우 잘리지 않고 그대로 출력
		// \t는 일정 간격 띄우기
		if(str1 == str2) {
			System.out.println("OK"); // str1, str2의 주소가 동일한지
		}
		if(str1.equals(str2)) {
			System.out.println("OK2"); // str1, str2 string 가 동일한지
		}
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		if(str1 == str3) {
			System.out.println("OK3"); // str1, str3의 주소가 동일한지 -> 다름
		}
		if(str1.equals(str4)) {
			System.out.println("OK4"); // str1, str4 string 가 동일한지 -> abc로 동일
		}
	}

}
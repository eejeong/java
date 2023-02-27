package array;

public class P102 {

	public static void main(String[] args) {
		int a = 100; // 정수
		
		int arr[] = new int[3]; // 배열 reference type
		arr[0] = 10;
		arr[1] = 20;		
		arr[2] = 30;
		System.out.println(a);
		System.out.println(arr);
		
		for(int i=0; i< arr.length ; i++) { // 배열 사이즈 3 (0,1,2)
			System.out.printf("%d \t", arr[i]);
	}
	System.out.println("Type 2 ");
	for(int data:arr) {
		System.out.printf("%d \t", data);
	}
}
}
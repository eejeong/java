package calculator;

public class Ui {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int result = 0;
		result = cal.sum(10, 20);
		System.out.println(result);
		cal.save(result);
		System.out.println("OK"); // 예외처리 : void는 결과값을 출력하지 않지만, 결과값을 확인해야하는 경우 예외처리함
	}
}

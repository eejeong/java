package inherit2;

import java.util.Date;

public class App3 {

	public static void main(String[] args) {
		Empolyee e1 = new Empolyee();
		Empolyee e2 = new Manager();
		Empolyee e3 = new Sales();

		Object obj1 = new Empolyee();
		Object obj2 = new Manager();
		Object obj3 = new Date();
	}

}

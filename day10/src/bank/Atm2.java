package bank;

public class Atm2 {

	public static void main(String[] args) {
		Account acc1 = null;
		try {
			acc1 = new Account(10000);
			System.out.println(acc1);
			acc1.widthdraw(20000);
		} catch (Exception e) {
			System.out.println(MakeMessage.makeMessage(e.getMessage()));
			System.out.println(e.getMessage());
		}


	}

}

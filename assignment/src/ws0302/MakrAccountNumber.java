package ws0302;

import java.util.Calendar;
import java.util.Random;

public class MakrAccountNumber {
	public static String makeAccNum() {
		String accNum = "";
		Random r = new Random();
		Calendar cal = Calendar.getInstance();
		accNum = "" + cal.get(Calendar.YEAR)
					+ (cal.get(Calendar.MONTH)+1)
					+ cal.get(Calendar.DAY_OF_WEEK)
					+ cal.get(Calendar.MILLISECOND)
					+ r.nextInt(9)
					+ r.nextInt(5);
		return accNum;
	}
}

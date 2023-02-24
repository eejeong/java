package ifcontrol;

public class P88 {

	public static void main(String[] args) {
		String grade = "";
		String gender = "M";
		double sum = 50.0;
		
		System.out.println("Start....");

		if(gender.equals("M")) {
			System.out.println("Male....");
		}else {
			System.out.println("Female....");
		}
		
		if((sum <= 100 && sum >= 95) || (sum <= 90 && sum >= 85)) {
			grade = "VIP";                                                // 100~95 또는 90~85 VIP
		} else if((sum <= 80 && sum >= 75) || (sum <= 65 && sum >= 60)) {
			grade = "GOLD";                                               // 80~75 또는 60~65 GOLD			
		}else {
			grade = "NORMAL";				
		}
		
		if(grade.equals("VIP")) {
			System.out.println("VIP 혜택....");
			//return; 다음 내용 실행되지 않음
		}
		
		System.out.printf("%s, %s, %4.2f \n", grade, gender, sum);
		
		System.out.println("End....");
	}
}

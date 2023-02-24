package ifcontrol;

public class P87 {

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
		
		if(sum >= 90.0) {
			grade = "VIP";
		}else if(sum >= 80.0) {
			grade = "GOLD";			
		}else if(sum >= 70.0) {
			grade = "SILVER";			
		}else if(sum >= 60.0) {
			grade = "BRONZE";			
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

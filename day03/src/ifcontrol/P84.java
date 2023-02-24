package ifcontrol;

public class P84 {

	public static void main(String[] args) {
		String grade = "";
		String gender = "F";
		double sum = 90.0;
		
		System.out.println("Start....");

		if(gender.equals("M")) {
			System.out.println("Male....");
		}else {
			System.out.println("Female....");
		}
		
	    // 남자이고, 90점 이상이면 MVIP
		// 여자이고, 90점 이상이면 FVIP
	    // 남자이고, 80점 이상이면 MGOLD
		// 여자이고, 80점 이상이면 FGOLD
	    // 남자이고, 80점 미만이면 MNORMAL
		// 여자이고, 80점 미만이면 FNORMAL
		
		if(gender.equals("M")) {
			if(sum >= 90) {
				grade = "MVIP";
			}else if(sum >= 80) {
				grade = "MGOLD";	
			}else {
				grade = "MNORMAL";	
			}
		}else {
			if(sum >= 90) {
				grade = "FVIP";
			}else if(sum >= 80) {
				grade = "FGOLD";	
			}else {
				grade = "FNORMAL";	
			}
		}
		
		
		switch (grade) {
		case "FVIP" :
		case "MVIP" :
			sum += 100;
		case "FGOLD" :
		case "MGOLD" :
			sum += 90;
		default:
			sum += 10;
		}
		
		System.out.printf("%s, %s, %4.2f \n", grade, gender, sum);
		
		System.out.println("End....");
	}
}

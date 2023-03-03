package inherit;

public class Manager extends Empolyee {
	private double bonus;

	public Manager() {
		super();
	}

	public Manager(String id, String name, double salary) {
		super(id, name, salary);
	}

	public Manager(String id, String name, double salary, double bonus) {
		super(id, name, salary);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}


	// 함수의 재정의 (overriding)
	@Override
	public double getAnnSalary() {
		double result = 0.0;
		result = (this.getSalary() + this.bonus) * 12;
	//  result = super.getAnnSalary() + (this.bonus * 12);
		return result;		
	}

	@Override
	public String toString() {
		return super.toString() + " " + bonus;
	}


	
	
	
	
}

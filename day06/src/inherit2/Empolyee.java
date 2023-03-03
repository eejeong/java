package inherit2;

public class Empolyee {
	private String id;
	private String name;
	private double salary;
	
	public Empolyee() {
	}

	public Empolyee(String id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public double getAnnSalary() {
		double result = 0.0;
		result = this.salary * 12;
		return result;
	}

	public double getSalary() {
		return salary;
	}

	public double getIncentive() {
		return 0.0;
	}
	
	@Override
	public String toString() {
		return id+" "+name+" "+salary;
	}
	
	
}

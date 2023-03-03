package inherit2;

public class TaxCal {
	public double getTax(Empolyee e) {
		double result = 0.0;
		result = e.getAnnSalary() * 0.17;
		return result;
	}
}

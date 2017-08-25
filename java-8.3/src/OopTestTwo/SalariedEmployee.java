package OopTestTwo;

public class SalariedEmployee extends ColaEmployee{
	private double monthSalary;
	
	public SalariedEmployee(String name, int month, double monthSalary) {
		super(name, month);
		this.monthSalary = monthSalary;
	}




	public double getMonthSalary() {
		return monthSalary;
	}
	
	

}

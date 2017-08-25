package OopTestTwo;

public class HourlyEmployee extends ColaEmployee{
	private double hourlySalary;
	private int hours;
	public HourlyEmployee(String name,int month,double hourlySalary,int hours) {
		super(name,month);
		this.hourlySalary=hourlySalary;
		this.hours=hours;
		
	}
	public double getHourlySalary() {
		return hourlySalary;
	}
	public int getHours() {
		return hours;
	}
	

}

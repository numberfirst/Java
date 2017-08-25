package OopTestTwo;

public class SalesEmployee extends ColaEmployee{
	private double monthSalesVolume;
	private double royaltyRate;
	public SalesEmployee(String name, int month, double monthSalesVolume, double royaltyRate) {
		super(name, month);
		this.monthSalesVolume = monthSalesVolume;
		this.royaltyRate = royaltyRate;
	}
	public double getMonthSalesVolume() {
		return monthSalesVolume;
	}
	public double getRoyaltyRate() {
		return royaltyRate;
	}
	

}

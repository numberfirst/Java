package MeInfo;

import java.util.ArrayList;

public class MeLoanInfo extends MeCardInfo{
	private double loanNum;
	private int loanYears;
	private ArrayList<Double> yearAccrual=new ArrayList<>(1);
	private double allLoanNum;
	private boolean hasHouse;
	private boolean mortgageHouse;
	private double salary;
	
	
	public MeLoanInfo() {
		super();
	}
	public MeLoanInfo(long cardId, String name, String id, String phone,int age) {
		super(cardId, name, id, phone,age);
		
	}
	public ArrayList<Double> getYearAccrual() {
		return yearAccrual;
	}
	public void setYearAccrual(ArrayList<Double> yearAccrual) {
		this.yearAccrual = yearAccrual;
	}
	public boolean isHasHouse() {
		return hasHouse;
	}
	public void setHasHouse(boolean hasHouse) {
		this.hasHouse = hasHouse;
	}
	public boolean isMortgageHouse() {
		return mortgageHouse;
	}
	public void setMortgageHouse(boolean mortgageHouse) {
		this.mortgageHouse = mortgageHouse;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getLoanNum() {
		return loanNum;
	}
	public void setLoanNum(double loanNum) {
		this.loanNum = loanNum;
	}
	public int getLoanYears() {
		return loanYears;
	}
	public void setLoanYears(int loanYears) {
		this.loanYears = loanYears;
	}
	
	public double getAllLoanNum() {
		return allLoanNum;
	}
	public void setAllLoanNum(double sum) {
		
		this.allLoanNum = sum;
	}	
}

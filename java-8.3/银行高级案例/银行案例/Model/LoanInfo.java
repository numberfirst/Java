package 银行案例.Model;

import java.math.BigDecimal;

public class LoanInfo{
	private Account account;
	private BigDecimal loanNum;
	private int loanYears;
	private BigDecimal repayment;
	private boolean hasHouse;
	private boolean mortHouse;
	private double salary;
	private int grade;
	private String date;
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public BigDecimal getLoanNum() {
		return loanNum;
	}
	public void setLoanNum(BigDecimal loanNum) {
		this.loanNum = loanNum;
	}
	public int getLoanYears() {
		return loanYears;
	}
	public void setLoanYears(int loanYears) {
		this.loanYears = loanYears;
	}
	public BigDecimal getRepayment() {
		return repayment;
	}
	public void setRepayment(BigDecimal repayment) {
		this.repayment = repayment;
	}
	public boolean isHasHouse() {
		return hasHouse;
	}
	public void setHasHouse(boolean hasHouse) {
		this.hasHouse = hasHouse;
	}
	public boolean isMortHouse() {
		return mortHouse;
	}
	public void setMortHouse(boolean mortHouse) {
		this.mortHouse = mortHouse;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}		
}

package 银行案例.Model;

import java.util.ArrayList;
import java.util.Map;

import org.apache.commons.collections.MultiMap;



public class WrapData {
	private Map<String,Account> accounts;
	private Account account;
	private MultiMap transactionRecords;
	private Map<String,LoanInfo> loanInfoRecords;
	private ArrayList<Double> yearAccrual;
	
	private MultiMap repayRecords;
	
	private MultiMap withdrawalRecords;
	
	public Map<String, Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(Map<String, Account> accounts) {
		this.accounts = accounts;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public MultiMap getTransactionRecords() {
		return transactionRecords;
	}
	public void setTransactionRecords(MultiMap records) {
		this.transactionRecords = records;
	}
	public Map<String, LoanInfo> getLoanInfoRecords() {
		return loanInfoRecords;
	}
	public void setLoanInfoRecords(Map<String, LoanInfo> loanInfoRecords) {
		this.loanInfoRecords = loanInfoRecords;
	}
	public ArrayList<Double> getYearAccrual() {
		return yearAccrual;
	}
	public void setYearAccrual(ArrayList<Double> yearAccrual) {
		this.yearAccrual = yearAccrual;
	}
	
	
	public MultiMap getRepayRecords() {
		return repayRecords;
	}
	public void setRepayRecords(MultiMap repayRecords) {
		this.repayRecords = repayRecords;
	}
	
	
	public MultiMap getWithdrawalRecords() {
		return withdrawalRecords;
	}
	public void setWithdrawalRecords(MultiMap withdrawalRecords) {
		this.withdrawalRecords = withdrawalRecords;
	}
	
	
	
	
	
	
	
	
	
	

}

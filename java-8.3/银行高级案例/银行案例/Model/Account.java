package 银行案例.Model;

import java.math.BigDecimal;


public class Account {
	private Customer customer;
	private String cardId;
	private String password;
	private BigDecimal balance;
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal blance) {
		this.balance = blance;
	}
	@Override
	public String toString() {
		return "Account [customer=" + customer + ", cardId=" + cardId + ", password=" + password + ", balance="
				+ balance + "]";
	}

	
	

}

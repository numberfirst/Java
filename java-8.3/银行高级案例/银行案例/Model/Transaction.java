package 银行案例.Model;

import java.math.BigDecimal;


public class Transaction {
	private String card;
	private BigDecimal amount;
	private String transferTime;
	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getTransferTime() {
		return transferTime;
	}

	public void setTransferTime(String transferTime) {
		this.transferTime = transferTime;
	}

	@Override
	public String toString() {
		return "您于" + transferTime + "向卡号为"+ card + "的用户转账" + amount + "元！\n";
	}

	

	
	


	

}

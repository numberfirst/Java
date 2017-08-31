package 银行案例.Model;

import java.math.BigDecimal;

public class RepaymentInfo {
	private BigDecimal repayAmount;
	private String repayDate;
	public BigDecimal getRepayAmount() {
		return repayAmount;
	}
	public void setRepayAmount(BigDecimal repayAmount) {
		this.repayAmount = repayAmount;
	}
	public String getRepayDate() {
		return repayDate;
	}
	public void setRepayDate(String repayDate) {
		this.repayDate = repayDate;
	}
	

}

package 银行案例.Handler;

import 银行案例.Cache.AccountCache;
import 银行案例.Model.LoanInfo;

public class CountGrade {
	public static int countGrade(LoanInfo loanInfo) {
		double balance=AccountCache.getInstance().getWrapdata().getAccount().getBalance().doubleValue();
		int grade=(int) (balance/10000);
		grade=grade+(int) (loanInfo.getSalary()/3000);
		if(loanInfo.isHasHouse()) {
			grade+=2;
		}
		if(loanInfo.isMortHouse()) {
			grade+=5;
		}
		if(AccountCache.getInstance().getWrapdata().getAccount().getCustomer().getAge()>=20&&AccountCache.getInstance().getWrapdata().getAccount().getCustomer().getAge()<=50) {
			grade+=3;
		}
		return grade;
	}

}

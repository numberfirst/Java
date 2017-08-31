package 银行案例.Service;

import java.math.BigDecimal;

import 银行案例.Cache.AccountCache;
import 银行案例.Utils.InputFactory;
import 银行案例.Utils.ReturnMenu;
import 银行案例.Utils.InputFactory.TYPE;

public class WithdrawalServive {
	public static void withdrawal() {
		try {
			System.out.println("*************************");
			System.out.print("请输入你要取出的金额：");
			double d=(double) InputFactory.getInput(TYPE.DOUBLE);
			BigDecimal b=new BigDecimal(d);
			if(b.compareTo(AccountCache.getInstance().getWrapdata().getAccount().getBalance())==1||b.compareTo(BigDecimal.ZERO)==-1) {
				System.out.println("输入的金额不正确！");
			}else {
				BigDecimal result=AccountCache.getInstance().getWrapdata().getAccount().getBalance().subtract(b);
				AccountCache.getInstance().getWrapdata().getAccount().setBalance(result);
				System.out.println("您现在的余额为："+AccountCache.getInstance().getWrapdata().getAccount().getBalance());
			}
		}catch(Exception e) {
			System.out.println("输入错误！");
		} 
		finally {
			ReturnMenu.returnMenu();
		}
		
		
	}

}

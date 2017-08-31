package 银行案例.Service;

import java.math.BigDecimal;

import 银行案例.Cache.AccountCache;
import 银行案例.Utils.InputFactory;
import 银行案例.Utils.InputFactory.TYPE;
import 银行案例.Utils.ReturnMenu;

public class DepositService {
	public static void deposit() {
		System.out.println("*************************");
		System.out.print("请输入你要存入的金额：");
		try {		
			double d=(double) InputFactory.getInput(TYPE.DOUBLE);
			if(d>0) {				
				BigDecimal a=new BigDecimal(d);				
				BigDecimal b=AccountCache.getInstance().getWrapdata().getAccount().getBalance();
				BigDecimal result=b.add(a);
				AccountCache.getInstance().getWrapdata().getAccount().setBalance(result);
				System.out.println("您现在的余额为："+AccountCache.getInstance().getWrapdata().getAccount().getBalance());
			}else {
				System.out.println("输入的金额不正确！");
			}
		}catch(Exception e) {
			System.out.println("输入的金额不正确！");
		}finally {
			ReturnMenu.returnMenu();
		}
	}
	

}

package 银行案例.Handler;

import java.util.ArrayList;

import 银行案例.Cache.AccountCache;
import 银行案例.Utils.ReturnMenu;

public class PrintAccrualInfo {
	private static AccrualAssembleHandler accrualAssembleHandler = new AccrualAssembleHandler();
	private static ArrayList<Double> yearAccruals;
	public static void printAccrualInfo() throws Exception {
		if(AccountCache.getInstance().getWrapdata().getYearAccrual()==null) {
			yearAccruals=accrualAssembleHandler.loadAccrual();
			AccountCache.getInstance().getWrapdata().setYearAccrual(yearAccruals);
		}
		System.out.println("*************************");
		for(int i=1;i<11;i++) {
			System.out.println((2017+i)+"年："+AccountCache.getInstance().getWrapdata().getYearAccrual().get(i-1));
		}
		System.out.println("注：本行有权根据国家规定调整利率,十年后的利率暂与第十年的利率相同！");
		ReturnMenu.returnMenu();
	}

}

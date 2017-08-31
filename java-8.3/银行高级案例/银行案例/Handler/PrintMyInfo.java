package 银行案例.Handler;

import 银行案例.Cache.AccountCache;
import 银行案例.Utils.ReturnMenu;

public class PrintMyInfo {
	public static void printInfo() {
		System.out.println("*************************");
		System.out.println("用户姓名:"+AccountCache.getInstance().getWrapdata().getAccount().getCustomer().getName());
		System.out.println("身份证:"+AccountCache.getInstance().getWrapdata().getAccount().getCustomer().getId());
		System.out.println("年龄："+AccountCache.getInstance().getWrapdata().getAccount().getCustomer().getAge());
		System.out.println("电话号码："+AccountCache.getInstance().getWrapdata().getAccount().getCustomer().getPhone());
		System.out.println("卡号："+AccountCache.getInstance().getWrapdata().getAccount().getCardId());
		System.out.println("余额："+AccountCache.getInstance().getWrapdata().getAccount().getBalance().doubleValue());
		
		ReturnMenu.returnMenu();
	}
}

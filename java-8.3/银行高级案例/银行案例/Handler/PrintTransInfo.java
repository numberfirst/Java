package 银行案例.Handler;

import java.util.Iterator;
import java.util.Set;

import org.apache.commons.collections.MultiMap;

import 银行案例.Cache.AccountCache;
import 银行案例.Utils.ReturnMenu;

public class PrintTransInfo {
	private static TransactionAssembleHandler transactionAssembleHandler = new TransactionAssembleHandler();
	private static MultiMap transactionAssembleRecords;
	public static void printTransInfo() throws Exception {
		System.out.println("*************************");
		if(AccountCache.getInstance().getWrapdata().getTransactionRecords()==null) {
			transactionAssembleRecords=transactionAssembleHandler.loadTransactions();
			AccountCache.getInstance().getWrapdata().setTransactionRecords(transactionAssembleRecords);
			
		}		
		if(AccountCache.getInstance().getWrapdata().getTransactionRecords()==null) {				
			System.out.println("您暂无转账记录！");
		}else {
			if(AccountCache.getInstance().getWrapdata().getTransactionRecords().containsKey(AccountCache.getInstance().getWrapdata().getAccount().getCardId())) {
				Set keys=AccountCache.getInstance().getWrapdata().getTransactionRecords().keySet();
				Iterator it=keys.iterator();
				while(it.hasNext()) {
					System.out.println("-------------------------");
					String str=(String) it.next();
					if(str.equals(AccountCache.getInstance().getWrapdata().getAccount().getCardId())) {			
						String date=AccountCache.getInstance().getWrapdata().getTransactionRecords().get(str).toString();						
						System.out.println(date);
					}
					System.out.println("-------------------------");
				}
			}else {
				System.out.println("您暂无转账记录！");
			}
						
		}
		ReturnMenu.returnMenu();
			
	}

}

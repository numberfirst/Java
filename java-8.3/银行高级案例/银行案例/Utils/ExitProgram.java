package 银行案例.Utils;

import 银行案例.Cache.AccountCache;
import 银行案例.Handler.AccountOutputHandler;
import 银行案例.Handler.LoanInfoOutputHander;
import 银行案例.Handler.TransactionOutputHandler;

public class ExitProgram {
	public static void exitProgram() throws Exception {		
		System.out.println("*************************");
		System.out.println("安全退出！");
		new AccountOutputHandler().accountOutput();
//		if(!(AccountCache.getInstance().getWrapdata().getTransactionRecords()==null))
//			new TransactionOutputHandler().transactionOutput();	
		if(!(AccountCache.getInstance().getWrapdata().getLoanInfoRecords()==null))
			new LoanInfoOutputHander().loanInfoOutput();
		System.exit(0);
	}

}

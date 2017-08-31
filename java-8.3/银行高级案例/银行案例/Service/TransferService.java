package 银行案例.Service;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.collections.MultiMap;

import 银行案例.Cache.AccountCache;
import 银行案例.Handler.TransactionAssembleHandler;
import 银行案例.Model.Transaction;
import 银行案例.Utils.InputFactory;
import 银行案例.Utils.InputFactory.TYPE;
import 银行案例.Utils.ReturnMenu;

public class TransferService {
	private static TransactionAssembleHandler handler = new TransactionAssembleHandler();
	private static MultiMap records;
	public static void transferAccounts(){
		try {
			if(AccountCache.getInstance().getWrapdata().getTransactionRecords()==null) {
			records=handler.loadTransactions();
			AccountCache.getInstance().getWrapdata().setTransactionRecords(records);
			}
//			System.out.println(AccountCache.getInstance().getWrapdata().getTransactionRecords().get("1"));
			Transaction transaction=new Transaction();
			System.out.println("*************************");
			System.out.print("请输入您要转账的卡号：");
			String cardId=(String) InputFactory.getInput(TYPE.STRING);
			transaction.setCard(cardId);
			if(AccountCache.getInstance().getWrapdata().getAccounts().containsKey(cardId)) {				
				System.out.print("请输入您要转账的金额：");
				double d=(double) InputFactory.getInput(TYPE.DOUBLE);
				BigDecimal b=new BigDecimal(d);
				if((b.compareTo(AccountCache.getInstance().getWrapdata().getAccount().getBalance())==-1)&&(b.compareTo(BigDecimal.ZERO)==1)) {
					transaction.setAmount(b);
					BigDecimal result=AccountCache.getInstance().getWrapdata().getAccount().getBalance().subtract(b);
					AccountCache.getInstance().getWrapdata().getAccount().setBalance(result);
					BigDecimal resultOne=AccountCache.getInstance().getWrapdata().getAccounts().get(cardId).getBalance().add(b);
					AccountCache.getInstance().getWrapdata().getAccounts().get(cardId).setBalance(resultOne);
					Date now=new Date();
					String s= now.toString();
					transaction.setTransferTime(s);
					AccountCache.getInstance().getWrapdata().getTransactionRecords().put(AccountCache.getInstance().getWrapdata().getAccount().getCardId(),transaction);
//					System.out.println(AccountCache.getInstance().getWrapdata().getTransactionRecords().get("2"));
					System.out.println("转账成功");
					System.out.println("*************************");
					System.out.println("余额："+AccountCache.getInstance().getWrapdata().getAccount().getBalance());
				}else {
					System.out.println("余额不足！");
				}
				
			}else {
				System.out.println("输入的卡号不对！");
			}
		}catch(Exception e) {
			System.out.println("输入错误！");
		}
		finally {
			ReturnMenu.returnMenu();
		}
	}
	

}

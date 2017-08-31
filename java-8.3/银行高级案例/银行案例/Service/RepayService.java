package 银行案例.Service;

import java.math.BigDecimal;
import java.util.Map;

import 银行案例.Cache.AccountCache;
import 银行案例.Handler.LoanInfoAssembleHandler;
import 银行案例.Model.LoanInfo;
import 银行案例.Utils.InputFactory;
import 银行案例.Utils.ReturnMenu;
import 银行案例.Utils.InputFactory.TYPE;

public class RepayService {
	private static LoanInfoAssembleHandler  loanInfoAssembleHandler = new  LoanInfoAssembleHandler();
	private static Map<String, LoanInfo> loanInfoRecords;
	public static void repay() throws Exception {
		if(AccountCache.getInstance().getWrapdata().getLoanInfoRecords()==null) {
			loanInfoRecords=loanInfoAssembleHandler.loadLoanInfos();
			AccountCache.getInstance().getWrapdata().setLoanInfoRecords(loanInfoRecords);		
		}
		System.out.println("*************************");
		System.out.println("还需还款金额："+AccountCache.getInstance().getWrapdata().getLoanInfoRecords().get(AccountCache.getInstance().getWrapdata().getAccount().getCardId()).getRepayment());
		try {
			if(AccountCache.getInstance().getWrapdata().getLoanInfoRecords().containsKey(AccountCache.getInstance().getWrapdata().getAccount().getCardId())) {
				System.out.print("请输入你要还款的金额：");
				double d=(double) InputFactory.getInput(TYPE.DOUBLE);
				BigDecimal repayment=new BigDecimal(d);
				if(AccountCache.getInstance().getWrapdata().getLoanInfoRecords().get(AccountCache.getInstance().getWrapdata().getAccount().getCardId()).getRepayment().compareTo(repayment)==-1) {
					System.out.println("您的还款金额大于所需还款金额！");
				}else if(d<=0) {
					System.out.println("输入的金额不正确！");
				}else {
					BigDecimal allrepay= AccountCache.getInstance().getWrapdata().getLoanInfoRecords().get(AccountCache.getInstance().getWrapdata().getAccount().getCardId()).getRepayment().subtract(repayment);
					AccountCache.getInstance().getWrapdata().getLoanInfoRecords().get(AccountCache.getInstance().getWrapdata().getAccount().getCardId()).setRepayment(allrepay);
					System.out.println("还款成功！");
					System.out.println("剩余还款金额："+AccountCache.getInstance().getWrapdata().getLoanInfoRecords().get(AccountCache.getInstance().getWrapdata().getAccount().getCardId()).getRepayment());
				}
			}else {
				System.out.println("您暂无贷款记录！");
			}
		} catch (Exception e) {
			System.out.println("输入的错误！");
		}finally {
			ReturnMenu.returnMenu();
		}
		
	}

}

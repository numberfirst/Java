package 银行案例.Handler;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import 银行案例.Cache.AccountCache;
import 银行案例.Model.LoanInfo;
import 银行案例.Utils.ReturnMenu;

public class PrintLoanInfo {
	private static LoanInfoAssembleHandler  loanInfoAssembleHandler = new  LoanInfoAssembleHandler();
	private static Map<String, LoanInfo> loanInfoRecords;
	private static AccrualAssembleHandler accrualAssembleHandler = new AccrualAssembleHandler();
	private static ArrayList<Double> yearAccrual;
	public static void printLoanInfo() throws Exception {
		System.out.println("*************************");
		if(AccountCache.getInstance().getWrapdata().getYearAccrual()==null) {
			yearAccrual=accrualAssembleHandler.loadAccrual();
			AccountCache.getInstance().getWrapdata().setYearAccrual(yearAccrual);
		}		
		if(AccountCache.getInstance().getWrapdata().getLoanInfoRecords()==null) {
			loanInfoRecords=loanInfoAssembleHandler.loadLoanInfos();
			AccountCache.getInstance().getWrapdata().setLoanInfoRecords(loanInfoRecords);			
		}		
		if(AccountCache.getInstance().getWrapdata().getLoanInfoRecords()==null) {				
			System.out.println("您暂无贷款记录！");
		}else {
			yearAccrual=accrualAssembleHandler.loadAccrual();
			if(AccountCache.getInstance().getWrapdata().getLoanInfoRecords().containsKey(AccountCache.getInstance().getWrapdata().getAccount().getCardId())) {
				Set keys=AccountCache.getInstance().getWrapdata().getLoanInfoRecords().keySet();
				Iterator it=keys.iterator();
				while(it.hasNext()) {
					String str=(String) it.next();
					DecimalFormat df=new DecimalFormat("0.00");
					if(str.equals(AccountCache.getInstance().getWrapdata().getAccount().getCardId())) {	
						System.out.println("-------------------------");
						System.out.println("用户姓名:"+AccountCache.getInstance().getWrapdata().getAccount().getCustomer().getName());
						System.out.println("身份证:"+AccountCache.getInstance().getWrapdata().getAccount().getCustomer().getId());
						System.out.println("年龄："+AccountCache.getInstance().getWrapdata().getAccount().getCustomer().getAge());
						System.out.println("电话号码："+AccountCache.getInstance().getWrapdata().getAccount().getCustomer().getPhone());
						System.out.println("月工资："+AccountCache.getInstance().getWrapdata().getLoanInfoRecords().get(str).getSalary());	
						System.out.println("卡号："+AccountCache.getInstance().getWrapdata().getAccount().getCardId());
						System.out.println("贷款金额："+AccountCache.getInstance().getWrapdata().getLoanInfoRecords().get(str).getLoanNum());	
						System.out.println("贷款时间："+AccountCache.getInstance().getWrapdata().getLoanInfoRecords().get(str).getDate());	
						System.out.println("贷款年限："+AccountCache.getInstance().getWrapdata().getLoanInfoRecords().get(str).getLoanYears()+"年");
						System.out.println("是否抵押房屋："+AccountCache.getInstance().getWrapdata().getLoanInfoRecords().get(str).isMortHouse());
						System.out.println("具体还款细则：");
						BigDecimal accrual = null;
						for(int i=0;i<AccountCache.getInstance().getWrapdata().getLoanInfoRecords().get(str).getLoanYears();i++) {
							if(i<10) {
								accrual=new BigDecimal(AccountCache.getInstance().getWrapdata().getYearAccrual().get(i));
								
							}
							if(i>=10) {
								accrual=new BigDecimal(AccountCache.getInstance().getWrapdata().getYearAccrual().get(9));
							}
							double d=AccountCache.getInstance().getWrapdata().getLoanInfoRecords().get(str).getLoanNum().multiply(accrual).doubleValue();
							double loanNum=AccountCache.getInstance().getWrapdata().getLoanInfoRecords().get(str).getLoanNum().doubleValue();
							double aver=loanNum/AccountCache.getInstance().getWrapdata().getLoanInfoRecords().get(str).getLoanYears();						
							System.out.println("第"+(i+1)+"年需还"+df.format(aver+d)+"元");
						}								
						System.out.println("总还款金额："+df.format(AccountCache.getInstance().getWrapdata().getLoanInfoRecords().get(str).getRepayment().doubleValue()));
						System.out.println("-------------------------");
					}				
				}
				
			}else {
				System.out.println("您暂无贷款记录！");
			}
						
		}
		ReturnMenu.returnMenu();			
	}


}

package 银行案例.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import 银行案例.Cache.AccountCache;
import 银行案例.Handler.AccrualAssembleHandler;
import 银行案例.Handler.CountGrade;
import 银行案例.Handler.LoanInfoAssembleHandler;
import 银行案例.Model.LoanInfo;
import 银行案例.Utils.ExitProgram;
import 银行案例.Utils.InputFactory;
import 银行案例.Utils.ReturnMenu;
import 银行案例.Utils.InputFactory.TYPE;

public class LoanService {
	private static AccrualAssembleHandler accrualAssembleHandler = new AccrualAssembleHandler();
	private static ArrayList<Double> yearAccruals;
	private static LoanInfoAssembleHandler  loanInfoAssembleHandler = new  LoanInfoAssembleHandler();
	private static Map<String, LoanInfo> loanInfoRecords;
	
	public static void loan() throws Exception {
		if(AccountCache.getInstance().getWrapdata().getYearAccrual()==null) {
			yearAccruals=accrualAssembleHandler.loadAccrual();
			AccountCache.getInstance().getWrapdata().setYearAccrual(yearAccruals);
		}		
		if(AccountCache.getInstance().getWrapdata().getLoanInfoRecords()==null) {
			loanInfoRecords=loanInfoAssembleHandler.loadLoanInfos();
			AccountCache.getInstance().getWrapdata().setLoanInfoRecords(loanInfoRecords);			
		}
//		System.out.println(AccountCache.getInstance().getWrapdata().getLoanInfos().get("1"));
		try {
		System.out.println("*************************");
		if(!AccountCache.getInstance().getWrapdata().getLoanInfoRecords().containsKey(AccountCache.getInstance().getWrapdata().getAccount().getCardId())) {
			LoanInfo loanInfo=new LoanInfo();
			loanInfo.setAccount(AccountCache.getInstance().getWrapdata().getAccount());
			
			System.out.print("请确认您是否有房(1.是/0.否)：");
			int a=(int) InputFactory.getInput(TYPE.INT);
			if(a==1) {
				loanInfo.setHasHouse(true);
				System.out.print("请确认您是否抵押房(1.是/0.否)：");
				int b=(int) InputFactory.getInput(TYPE.INT);
				if(b==1) {
					loanInfo.setMortHouse(true);
				}else {
					loanInfo.setMortHouse(false);
				}
			}else {
				loanInfo.setHasHouse(false);
			}			
			System.out.print("请输入你的月工资：");
			double salary=(double) InputFactory.getInput(TYPE.DOUBLE);
			loanInfo.setSalary(salary);	
			loanInfo.setGrade(CountGrade.countGrade(loanInfo));
			double maxLoanNum=10000*loanInfo.getGrade();
			System.out.println("您目前的银行信用评估为："+loanInfo.getGrade()+"分");		
			System.out.println("您的最大贷款额度为："+maxLoanNum+"元");
			if(((int)loanInfo.getGrade()/3)>40){
				System.out.println("您的最多贷款年限为：40年");
			}
			else {
				System.out.println("您的最多贷款年限为："+((int)loanInfo.getGrade()/3));
			}
			System.out.println("*************************");
			System.out.println("是否贷款?\n"+"1.确定\n"+"2.退出");
			System.out.println("*************************");
			System.out.print("请输入您要进行的操作：");
			int i=(int) InputFactory.getInput(TYPE.INT);
			System.out.println("*************************");
			if(i==1) {
				System.out.print("请输入您要贷款的金额：");
				double d=(double) InputFactory.getInput(TYPE.DOUBLE);
				if(d>maxLoanNum||d<=0) {
					System.out.println("输入错误！");
					return;
				}else {
					BigDecimal loanNum=new BigDecimal(d);
					loanInfo.setLoanNum(loanNum);
				}
				System.out.print("请输入您要贷款的年限：");
				int year=(int) InputFactory.getInput(TYPE.INT);
				if((year>((int)loanInfo.getGrade()/3))||year<=0||year>40) {
					System.out.println("输入错误！");
					return;
				}else {
					loanInfo.setLoanYears(year);
				}
				BigDecimal sum=loanInfo.getLoanNum();
				ArrayList<Double> yearAccrualAs=new ArrayList<Double>();
				BigDecimal yearAccrual = null;
				for(int j=0;j<loanInfo.getLoanYears();j++) {		
					if(j<10) {
						yearAccrualAs.add(AccountCache.getInstance().getWrapdata().getYearAccrual().get(j));
						yearAccrual=new BigDecimal(yearAccrualAs.get(j));						
					}
					if(j>=10) {
						yearAccrualAs.add(AccountCache.getInstance().getWrapdata().getYearAccrual().get(9));
						yearAccrual=new BigDecimal(yearAccrualAs.get(9));	
					}
					sum=sum.add(loanInfo.getLoanNum().multiply(yearAccrual));
				}
				loanInfo.setRepayment(sum);
				AccountCache.getInstance().getWrapdata().getAccount().setBalance(AccountCache.getInstance().getWrapdata().getAccount().getBalance().add(loanInfo.getLoanNum()));
				System.out.println("*************************");
				System.out.println("贷款成功！");
				Date date=new Date();
				String str=date.toString();
				loanInfo.setDate(str);
				System.out.println("您现在的余额为："+AccountCache.getInstance().getWrapdata().getAccount().getBalance());
				AccountCache.getInstance().getWrapdata().getLoanInfoRecords().put(loanInfo.getAccount().getCardId(), loanInfo);
			}else if(i==2) {
				ExitProgram.exitProgram();
			}			
			else {
				System.out.println("输入不正确");
			}
			
			
		}else {
			System.out.println("您已在本行贷过款！");
		}
		}
		catch (Exception e) {
			System.out.println("输入错误！");		
		}finally {
			ReturnMenu.returnMenu();
		}
	
		
		
  }

}

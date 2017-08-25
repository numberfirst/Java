package Hander;


import MeInfo.MeCardInfo;
import MeInfo.MeLoanInfo;

public class PrintInfo {

	public void printInfo(MeCardInfo meCardInfo) {
		System.out.println("*************************");
		System.out.println("用户姓名:"+meCardInfo.getName());
		System.out.println("身份证："+meCardInfo.getId());
		System.out.println("年龄："+meCardInfo.getAge());
		System.out.println("电话号码："+meCardInfo.getPhone());
		System.out.println("卡号："+meCardInfo.getCardId());
		String myString=new FormatHander().formatHander(meCardInfo.getBalance());
		System.out.println("余额："+myString);
		new BackSercice(meCardInfo).backServiceTwo();
	}
	public void printLoanInfo(MeLoanInfo meLoanInfo, MeCardInfo meCardInfo) {
		if(meLoanInfo.getLoanNum()==0) {
			System.out.println("您暂无贷款！");
			
		}else {
			System.out.println("*************************");
			System.out.println("贷款成功！");
			System.out.println("用户姓名:"+meCardInfo.getName());
			System.out.println("身份证："+meCardInfo.getId());
			System.out.println("年龄："+meCardInfo.getAge());
			System.out.println("电话号码："+meCardInfo.getPhone());
			String myString=new FormatHander().formatHander(meLoanInfo.getSalary());
			System.out.println("月工资："+myString);
			System.out.println("是否抵押房屋："+meLoanInfo.isMortgageHouse());
			System.out.println("卡号："+meCardInfo.getCardId());
			myString=new FormatHander().formatHander(meLoanInfo.getLoanNum());
			System.out.println("贷款金额："+myString);	
			System.out.println("贷款年限："+meLoanInfo.getLoanYears()+"年");
			System.out.println("具体还款细则：");
			for(int i=0;i<meLoanInfo.getYearAccrual().size();i++) {
				myString = new FormatHander().formatHander(meLoanInfo.getLoanNum()/meLoanInfo.getYearAccrual().size()+meLoanInfo.getLoanNum()*meLoanInfo.getYearAccrual().get(i));
				System.out.println("第"+(i+1)+"年需还"+myString+"元");
			}		
			myString = new FormatHander().formatHander(meLoanInfo.getAllLoanNum());
			System.out.println("总还款金额："+myString);
			myString = new FormatHander().formatHander(meCardInfo.getBalance()+meLoanInfo.getLoanNum());
			System.out.println("现余额："+myString);
		}		
		new BackSercice(meCardInfo,meLoanInfo).backService(2);
	}
	
}

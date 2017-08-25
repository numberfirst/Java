package Hander;


import java.util.ArrayList;
import java.util.Scanner;

import MeInfo.MeCardInfo;
import MeInfo.MeLoanInfo;
import Menu.Welcome;

public class Loan {
	public  void loanNum(MeCardInfo meCardInfo) {
		
			System.out.println("*************************");
			Scanner sc=new Scanner(System.in);
			MeLoanInfo meLoanInfo=new MeLoanInfo(meCardInfo.getCardId(),meCardInfo.getName(),meCardInfo.getId(),meCardInfo.getPhone(),meCardInfo.getAge());
			try {
			System.out.print("请确认您是否有房(1.是/2.否)：");
			int a=sc.nextInt();
			if(a==1) {
				meLoanInfo.setHasHouse(true);
			}else {
				meLoanInfo.setHasHouse(false);
			}
			System.out.print("请确认您是否抵押房(1.是/2.否)：");
			int b=sc.nextInt();
			if(a==1) {
				meLoanInfo.setMortgageHouse(true);
			}else {
				meLoanInfo.setMortgageHouse(false);
			}
			System.out.print("请输入你的月工资：");
			double salary=sc.nextDouble();
			meLoanInfo.setSalary(salary);		
			int grade=new CountGrade().countGrade(meLoanInfo,meCardInfo);
			double maxLoanNum=10000*grade;
			System.out.println("您目前的银行信用评估为："+grade+"分");		
			System.out.println("您的最大贷款额度为："+maxLoanNum+"\n"+"您的最多贷款年限为："+((int)grade/2));
			System.out.println("*************************");
			System.out.println("是否贷款\n"+"1.确定\n"+"2.退出");
			System.out.println("*************************");
			System.out.print("请输入您要进行的操作：");
			int i=sc.nextInt();
			System.out.println("*************************");
			if(i==1) {
				System.out.print("请输入您要贷款的金额：");
				double d=sc.nextDouble();
				if(d>maxLoanNum||d<=0) {
					System.out.println("输入错误！");
					return;
				}else {
					meLoanInfo.setLoanNum(d);
				}
				System.out.print("请输入您要贷款的年限：");
				int y=sc.nextInt();
				if(y>((int)grade/2)||y<=0) {
					System.out.println("输入错误！");
					return;
				}else {
					meLoanInfo.setLoanYears(y);
				}
				double sum=meLoanInfo.getLoanNum();				
				ArrayList<Double> yearAccrual=new ArrayList<Double>();				
				for(int j=0;j<meLoanInfo.getLoanYears();j++) {
					double m=0.01+Math.random()/10;
					yearAccrual.add(m);
					sum+=meLoanInfo.getLoanNum()*yearAccrual.get(j);
				}
				meLoanInfo.setYearAccrual(yearAccrual);
				meLoanInfo.setAllLoanNum(sum);
				meLoanInfo.addBalance(meCardInfo.getBalance()+d);
				new PrintInfo().printLoanInfo(meLoanInfo,meCardInfo);
			}else if(i==2) {
				new ExitProgram().exitProgram();
			}			
			else {
				System.out.println("输入不正确");
				new Welcome(meCardInfo).welcome();
			}
		} catch (Exception e) {
			System.out.println("输入错误！");
			meLoanInfo=null;
			new BackSercice(meCardInfo).backService(1);
		}
						
	}

}

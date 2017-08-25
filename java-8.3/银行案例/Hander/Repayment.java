package Hander;

import java.util.Scanner;

import MeInfo.MeCardInfo;
import MeInfo.MeLoanInfo;

public class Repayment {
	public void repayment(MeCardInfo meCardInfo,MeLoanInfo meLoanInfo) {
		System.out.println("*************************");
		System.out.println("是否提前还款？(1.是/2.否)");
		System.out.print("请输入您的操作：");
		Scanner sc=new Scanner(System.in);
		byte i=sc.nextByte();
		if(i==1) {
			
		}else if(i==2) {
			System.out.print("请输入您要还款的金额：");
			double d=sc.nextDouble();
			if(d>0&&d<=meCardInfo.getBalance()) {
				meCardInfo.subBalance(d);
				meLoanInfo.setAllLoanNum(meLoanInfo.getAllLoanNum()-d);
				new BackSercice(meCardInfo,meLoanInfo).backService(2);
			}else {
				System.out.println("您输入的金额不对！");
			}			
		}else {
			
		}
		
	}
	

}

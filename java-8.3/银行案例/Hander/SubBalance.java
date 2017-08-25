package Hander;

import java.util.Scanner;

import MeInfo.MeCardInfo;
import Menu.Welcome;

public class SubBalance {
   
	public void subBalance(MeCardInfo meCardInfo) {
		try {
			System.out.println("*************************");
			System.out.print("请输入你要取出的金额：");
			Scanner sc=new Scanner(System.in);
			double d=sc.nextDouble();
			if(d>meCardInfo.getBalance()) {
				System.out.println("输入的金额不正确！");
			}else {
				meCardInfo.subBalance(d);
				String myString=new FormatHander().formatHander(meCardInfo.getBalance());
				System.out.println("您现在的余额为："+myString);
			}
		}catch(Exception e) {
			System.out.println("输入错误！");
		} 
		finally {
			new BackSercice(meCardInfo).backService(1);
		}
		
		
	}
}

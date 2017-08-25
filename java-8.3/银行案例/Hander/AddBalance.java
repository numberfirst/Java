package Hander;

import java.util.Scanner;

import MeInfo.MeCardInfo;
import Menu.Welcome;

public class AddBalance {
    
	public void addBalance(MeCardInfo meCardInfo) {
		System.out.println("*************************");
		System.out.print("请输入你要存入的金额：");
		try {
			Scanner sc=new Scanner(System.in);
			double d=sc.nextDouble();
			if(d>=0) {
				meCardInfo.addBalance(d);
				String myString=new FormatHander().formatHander(meCardInfo.getBalance());
				System.out.println("您现在的余额为："+myString);
			}else {
				System.out.println("输入的金额不正确！");
			}
		}catch(Exception e) {
			System.out.println("输入的金额不正确！");
		}finally {			
			new BackSercice(meCardInfo).backService(1);
		}		
	}

}

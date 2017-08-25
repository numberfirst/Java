package Hander;

import java.util.Scanner;

import Bank.CustomInfo;
import MeInfo.MeCardInfo;
import Menu.Welcome;

public class TransferAccounts {

	public void transferAccounts(MeCardInfo meCardInfo, CustomInfo customInfos) {
		try {
			System.out.println("*************************");
			System.out.print("请输入您要转账的卡号：");
			Scanner sc=new Scanner(System.in);
			long l=sc.nextLong();
			if(customInfos.equals(l)) {
				System.out.print("请输入您要转账的金额：");
				double d=sc.nextDouble();
				if(d<=meCardInfo.getBalance()&&d>=0) {
					meCardInfo.subBalance(d);
					customInfos.getCustomInfos().get(customInfos.getI()).addBalance(d);
					System.out.println("转账成功");
					System.out.println("*************************");
					String myString=new FormatHander().formatHander(meCardInfo.getBalance());
					System.out.println("余额："+myString);
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
			new BackSercice(meCardInfo,customInfos).backService(3);	
		}
		
			
	}

}

package Hander;

import java.util.Scanner;

import Bank.CustomInfo;
import MeInfo.MeCardInfo;
import Menu.Welcome;

public class CheckPassword {
	public void checkPassWord(MeCardInfo meCardInfo, CustomInfo customInfos) {
		try {
			int i=1;
			for(;i<=3;i++) {
				Scanner sc=new Scanner(System.in);
				System.out.print("请输入您的卡号：");
				long cardId=sc.nextLong();
				System.out.print("请输入您的密码：");
				int password=sc.nextInt();				
				if(meCardInfo.equals(password,cardId)) {
					System.out.println("输入正确！");	
					new Welcome(meCardInfo,customInfos).welcome();
					break;
				}
				else {
					if(i==3) {
						System.out.println("您输入的次数已超过3次，不能继续输入！");
						new ExitProgram().exitProgram();
					}
					else {
						System.out.println("您的输入有误，请重新输入！");
						System.out.println("*************************");
					}				
				}
			}		
		
		} catch (Exception e) {
			System.out.println("*************************");
			System.out.println("您的输入有误，请重新输入！");
			checkPassWord(meCardInfo,customInfos);
		}
	}
	

}

package Hander;

import java.util.Scanner;
import MeInfo.MeCardInfo;


public class ReviseInfo {
	public void reviseInfo(MeCardInfo meCardInfo) {
		try {
			System.out.println("*************************");
			System.out.println("1.修改用户名字\n"+"2.修改电话号码\n"+"3.修改密码");
			System.out.println("*************************");
			System.out.print("请输入您要进行的操作：");
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			if(num==1) {
				System.out.print("请输入您要修改的名字：");
				String s=sc.next();
				meCardInfo.setName(s);;
				System.out.println("修改成功！");
			}else if(num==2) {
				System.out.print("请输入您要修改的电话号码：");
				String l=sc.next();
				meCardInfo.setPhone(l);
				System.out.println("修改成功！");
			}else if(num==3) {
				System.out.print("请输入您要修改的密码：");
				int i=sc.nextInt();
				meCardInfo.setPassWord(i);
				System.out.println("修改成功！");
			}
			else {
				System.out.println("您输入的不正确！");
			}		
		} catch (Exception e) {
			System.out.println("输入错误,修改失败！");			
		}finally {
			new BackSercice(meCardInfo).backService();
		}
		
	}

}

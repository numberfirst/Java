package Hander;

import java.util.Scanner;

import Bank.CustomInfo;
import MeInfo.MeCardInfo;
import MeInfo.MeLoanInfo;
import Menu.Welcome;

public class BackSercice {
	private MeCardInfo meCardInfo;
	private MeLoanInfo meLoanInfo;
	private CustomInfo customInfos;	
	public BackSercice(MeCardInfo meCardInfo, CustomInfo customInfos) {		
		this.meCardInfo = meCardInfo;
		this.customInfos = customInfos;
	}
	public BackSercice(MeCardInfo meCardInfo) {
		this.meCardInfo = meCardInfo;
	}
	
	public BackSercice(MeCardInfo meCardInfo,MeLoanInfo meLoanInfo) {
		this.meCardInfo = meCardInfo;
		this.meLoanInfo = meLoanInfo;
	}
	
	public void backService(int type) {
		try {
			while(true) {
				System.out.println("*************************");
				System.out.println("1.返回主界面,2.退出");
				System.out.print("请输入您要进行的操作：");
				Scanner sc=new Scanner(System.in);
				int i=sc.nextInt();
				if(i==1) {
					if(type==1)
					new Welcome(meCardInfo).welcome();
					if(type==2)
					new Welcome(meCardInfo,meLoanInfo).welcome();
					if(type==3)
					new Welcome(meCardInfo,customInfos).welcome();
					break;				
				}
				else if(i==2) {
					new ExitProgram().exitProgram();
				}			
				else {
					System.out.println("输入不正确");
				}	
			}
		} catch (Exception e) {
			System.out.println("输入错误！");
			backService(type);
		}					
	}
	public void backService() {
		try {
			while(true) {
				Scanner sc=new Scanner(System.in);
				System.out.println("*************************");
				System.out.println("1.返回个人信息界面,2.退出");
				System.out.print("请输入您要进行的操作：");
				int i=sc.nextInt();
				if(i==1) {
					new PrintInfo().printInfo(meCardInfo);
					break;	
				}			
				else if(i==2)
					new ExitProgram().exitProgram();
				else
					System.out.println("输入不正确");
			}
		} catch (Exception e) {
			System.out.println("输入错误！");
			backService();
		}
		
		
	}
	public void backServiceTwo() {
		try {
			while(true) {
				System.out.println("*************************");
				System.out.println("1.修改个人信息,2.返回主界面,3.退出");
				System.out.print("请输入您要进行的操作：");
				Scanner sc=new Scanner(System.in);
				int i=sc.nextInt();
				if(i==1) {
					new ReviseInfo().reviseInfo(meCardInfo);
				    break;
				}				
				else if(i==2) {
					new Welcome(meCardInfo).welcome();
					break;
				}			
				else if(i==3)
					new ExitProgram().exitProgram();
				else
					System.out.println("输入不正确");
			}
		} catch (Exception e) {
			System.out.println("输入错误！");
			backServiceTwo();
		}
		
		
	}
	

}

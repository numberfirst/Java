package 银行案例.Utils;

import 银行案例.Menu.Menu;
import 银行案例.Utils.InputFactory.TYPE;

public class ReturnMenu {
	public static void returnMenu() {
		try {
				System.out.println("*************************");
				System.out.println("1.返回主界面,2.退出");
				System.out.print("请输入您要进行的操作：");
				int i=(int) InputFactory.getInput(TYPE.INT);
				if(i==1) {
					Menu.welcome();				
				}
				else if(i==2) {
					ExitProgram.exitProgram();
				}			
				else {
					System.out.println("输入不正确!");
					returnMenu();
				}	
		} catch (Exception e) {
			System.out.println("输入错误！");
			returnMenu();
		}					
		
	}

}

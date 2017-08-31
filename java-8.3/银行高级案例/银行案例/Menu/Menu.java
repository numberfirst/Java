package 银行案例.Menu;

import 银行案例.Dispatch.MainDispatch;
import 银行案例.Utils.Biz;
import 银行案例.Utils.ExitProgram;
import 银行案例.Utils.InputFactory;
import 银行案例.Utils.InputFactory.TYPE;

public class Menu {		
	public static void welcome() throws Exception {
		System.out.println("*************************");
		System.out.println("主菜单");
		System.out.println("1.存款\n"+"2.取款\n"+"3.转账\n"+"4.贷款\n"+"5.查看信息\n"+"6.修改个人信息\n"+"7.还款\n"+"8.退出");
		System.out.println("*************************");
		systemOperation();
	}
	public static void systemOperation() throws Exception  {
		System.out.print("请输入您要进行的操作：");
		int num=(int) InputFactory.getInput(TYPE.INT);
		switch(num) {
		case 1:
			MainDispatch.dispatch(Biz.DEPOSITE);
			break;
		case 2:		
			MainDispatch.dispatch(Biz.WITTHDRAWAL);
			break;
		case 3:
			MainDispatch.dispatch(Biz.TRANSFER);
			break;
		case 4:
			MainDispatch.dispatch(Biz.LOAN);
			break;
		case 5:
			MainDispatch.dispatch(Biz.ENQUIRY);
			break;
		case 6:
			MainDispatch.dispatch(Biz.REVISE);
			break;
		case 7:
			MainDispatch.dispatch(Biz.REPAY);
			break;
		case 8:
			ExitProgram.exitProgram();
			break;
		default:
			System.out.println("您输入的不正确！");
			break;
		}
	}
		

}

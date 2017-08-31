package 银行案例.Menu;

import 银行案例.Dispatch.MainDispatch;
import 银行案例.Handler.PrintTransInfo;
import 银行案例.Utils.Biz;
import 银行案例.Utils.ExitProgram;
import 银行案例.Utils.InputFactory;
import 银行案例.Utils.InputFactory.TYPE;
import 银行案例.Utils.ReturnMenu;

public class InfoMenu {
	public static void infoMenu(){
		System.out.println("*************************");
		System.out.println("1.查看个人信息\n"+"2.查看转账信息\n"+"3.查看贷款信息\n"+"4.查看年利率\n"+"5.退出");
		System.out.println("*************************");
		try {
			infoOperation();
		} catch (Exception e) {
			ReturnMenu.returnMenu();
		}
	}
	public static void infoOperation() throws Exception {
		System.out.print("请输入您要进行的操作：");
		int num=(int) InputFactory.getInput(TYPE.INT);
		switch(num) {
		case 1:
			MainDispatch.dispatch(Biz.ENQUIRYMYINFO);
			break;
		case 2:		
			MainDispatch.dispatch(Biz.ENQUIRYTRANSINFO);
			break;
		case 3:
			MainDispatch.dispatch(Biz.ENQUIRYLOANINFO);
			break;
		case 4:
			MainDispatch.dispatch(Biz.ENQUIRYACCRUAL);
			break;
		case 5:
			ExitProgram.exitProgram();
			break;
		default:
			System.out.println("您输入的不正确！");
			break;
		}
	}

}

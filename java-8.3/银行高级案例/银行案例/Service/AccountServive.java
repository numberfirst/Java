package 银行案例.Service;

import 银行案例.Cache.AccountCache;
import 银行案例.Dispatch.MainDispatch;
import 银行案例.Handler.AccountHandler;
import 银行案例.Model.Account;
import 银行案例.Utils.Biz;
import 银行案例.Utils.ExitProgram;
import 银行案例.Utils.InputFactory;
import 银行案例.Utils.InputFactory.TYPE;


public class AccountServive {
	private AccountHandler accountHandler = new AccountHandler();
	int count = 0; 
	public void doLogin() throws Exception {
		System.out.println("********欢迎登陆***********");
		Account temp=new Account();
		System.out.print("请输入您的卡号：");
		temp.setCardId(InputFactory.getInput(TYPE.STRING).toString());
		System.out.print("请输入您的密码 ： ");
		temp.setPassword(InputFactory.getInput(TYPE.STRING).toString());
		temp=accountHandler.checkAccount(temp);
		if(temp!=null) {
			AccountCache.getInstance().getWrapdata().setAccount(temp);
			MainDispatch.dispatch(Biz.MENU);
		}else {
			if(count<2) {
				System.out.println("您的输入有误，请重新输入！");
				System.out.println("*************************");
				count++;
				doLogin();
			} else {
				System.out.println("您输入的次数已超过3次，不能继续输入！");
				ExitProgram.exitProgram();
			}
		}
		
	
		
	}

}

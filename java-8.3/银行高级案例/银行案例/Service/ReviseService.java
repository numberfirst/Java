package 银行案例.Service;

import 银行案例.Cache.AccountCache;
import 银行案例.Utils.InputFactory;
import 银行案例.Utils.ReturnMenu;
import 银行案例.Utils.InputFactory.TYPE;



public class ReviseService {
	public static void reviseInfo() {
		try {
			System.out.println("*************************");
			System.out.println("1.修改用户名字\n"+"2.修改电话号码\n"+"3.修改密码");
			System.out.println("*************************");
			System.out.print("请输入您要进行的操作：");
			int num=(int) InputFactory.getInput(TYPE.INT);
			if(num==1) {
				System.out.print("请输入您要修改的名字：");
				String name= (String) InputFactory.getInput(TYPE.STRING);
				AccountCache.getInstance().getWrapdata().getAccount().getCustomer().setName(name);
				System.out.println("修改成功！");
			}else if(num==2) {
				System.out.print("请输入您要修改的电话号码：");
				String phone=(String) InputFactory.getInput(TYPE.STRING);
				AccountCache.getInstance().getWrapdata().getAccount().getCustomer().setPhone(phone);
				System.out.println("修改成功！");
			}else if(num==3) {
				System.out.print("请输入您要修改的密码：");
				String pws=(String) InputFactory.getInput(TYPE.STRING);
				AccountCache.getInstance().getWrapdata().getAccount().setPassword(pws);
				System.out.println("修改成功！");
			}
			else {
				System.out.println("您输入的不正确！");
			}		
		} catch (Exception e) {
			System.out.println("输入错误,修改失败！");			
		}finally {
			ReturnMenu.returnMenu();
		}
		
	}
	

}

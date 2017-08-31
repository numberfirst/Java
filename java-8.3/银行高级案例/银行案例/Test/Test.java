package 银行案例.Test;
import 银行案例.Dispatch.MainDispatch;
import 银行案例.Service.AccountAssembleService;
import 银行案例.Utils.Biz;


public class Test {

	public static void main(String[] args) throws Exception {
		AccountAssembleService accountAssembleService=new AccountAssembleService();
		accountAssembleService.loadAccounts();
		MainDispatch.dispatch(Biz.LOGIN);
	}

}

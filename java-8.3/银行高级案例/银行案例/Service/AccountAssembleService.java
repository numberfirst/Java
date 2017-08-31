package 银行案例.Service;

import java.util.Map;
import 银行案例.Cache.AccountCache;
import 银行案例.Handler.AccountAssembleHandler;
import 银行案例.Model.Account;
import 银行案例.Model.WrapData;

public class AccountAssembleService {
	private AccountAssembleHandler handler = new AccountAssembleHandler();
	private Map<String , Account> accounts ;
	public void loadAccounts() throws Exception{
		accounts = handler.loadAccounts();
		WrapData wrapData = new WrapData();
		wrapData.setAccounts(accounts);
		AccountCache.getInstance().setWrapdata(wrapData);
	}

}

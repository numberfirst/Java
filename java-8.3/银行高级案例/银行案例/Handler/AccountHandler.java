package 银行案例.Handler;

import java.util.Map;

import 银行案例.Cache.AccountCache;
import 银行案例.Model.Account;

public class AccountHandler {
	private Map<String, Account> accounts;
	public Account checkAccount(Account account) {	
		accounts=AccountCache.getInstance().getWrapdata().getAccounts();
		if(accounts.containsKey(account.getCardId())) {
			Account eq=accounts.get(account.getCardId());
			if(eq.getPassword().equals(account.getPassword())) {
				return eq;
			}else{
				return null;
			}
		}else {
			return null;
		}		
	}

}

package 银行案例.Cache;

import 银行案例.Model.WrapData;

public class AccountCache {
	private static final AccountCache accountCache=new AccountCache();
	private WrapData wrapdata;
	private AccountCache() {		
	}
	
	public WrapData getWrapdata() {
		return wrapdata;
	}

	public void setWrapdata(WrapData wrapdata) {
		this.wrapdata = wrapdata;
	}

	public static AccountCache getInstance() {
		return accountCache;
	}
	

}

package Service;

import java.util.ArrayList;

import Bank.CustomInfo;
import Hander.CheckPassword;
import MeInfo.MeCardInfo;


public class Service {
	private CustomInfo customInfos;
	public Service() {
		MeCardInfo meCardInfo=new MeCardInfo(1, 123, "张三", "123412199012341234", 50000,"12345211234",34);
		MeCardInfo meCardInfo1=new MeCardInfo(2, 122, "李四", "12241219861231234", 80000,"12322121234",54);
		customInfos=new CustomInfo();
		ArrayList<MeCardInfo> a=new ArrayList<MeCardInfo>();
		a.add(meCardInfo);
		a.add(meCardInfo1);		
		customInfos.setCustomInfos(a);	
	}
	public void init() {
		new CheckPassword().checkPassWord(customInfos.getCustomInfos().get(0),customInfos);		
	}

}

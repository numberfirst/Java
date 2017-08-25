package Bank;

import java.util.ArrayList;
import MeInfo.MeCardInfo;


public class CustomInfo {
	private ArrayList<MeCardInfo> customInfos;
	private int i;
	
	public int getI() {
		return i;
	}


	public void setI(int i) {
		this.i = i;
	}


	public ArrayList<MeCardInfo> getCustomInfos() {
		return customInfos;
	}


	public void setCustomInfos(ArrayList<MeCardInfo> customInfos) {
		this.customInfos = customInfos;
	}


	public boolean equals(long cardId) {
		boolean b=false;
		for(int i=0;i<customInfos.size();i++) {
			if(customInfos.get(i).getCardId()==cardId) {
				b=true;
				setI(i);
				break;
			}
		}
		return b;
	}
	

}

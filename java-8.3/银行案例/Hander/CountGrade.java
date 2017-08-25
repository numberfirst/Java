package Hander;

import MeInfo.MeCardInfo;
import MeInfo.MeLoanInfo;

public class CountGrade {
	public int countGrade(MeLoanInfo meLoanInfo,MeCardInfo meCardInfo) {
		int grade=0;
		grade=grade+(int) (meCardInfo.getBalance()/5000);
		grade=grade+(int) (meLoanInfo.getSalary()/3000);
		if(meLoanInfo.isHasHouse()) {
			grade+=3;
		}
		if(meLoanInfo.isMortgageHouse()) {
			grade+=4;
		}
		if(meCardInfo.getAge()>=20&&meCardInfo.getAge()<=50) {
			grade+=2;
		}
		return grade;
	}

}

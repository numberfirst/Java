package Hander;

import java.text.NumberFormat;

public class FormatHander {
	public String formatHander(double num) {
		NumberFormat ins=NumberFormat.getInstance();
		ins.setMaximumFractionDigits(2);
		ins.setMinimumFractionDigits(1);
		String myString=ins.format(num);
		return myString;		
	}

}

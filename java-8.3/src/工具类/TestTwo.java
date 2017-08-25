package 工具类;

import java.util.Calendar;

public class TestTwo {

	public static void main(String[] args) {		
		Calendar c=Calendar.getInstance();
		c.set(2017,7, 22, 20, 5);
		System.out.println(c.getTime());
		c.add(Calendar.HOUR, 8);
		System.out.println(c.getTime());
		
	}

}

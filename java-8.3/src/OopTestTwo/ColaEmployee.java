package OopTestTwo;

import java.util.Calendar;

public class ColaEmployee {

	private String name;
	private int month;
	public ColaEmployee(String name,int month) {
		this.month=month;
		this.name=name;
	}	
	public double getSalary(double salary) {
		Calendar calendar=Calendar.getInstance();
		int months=calendar.get(Calendar.MONTH)+1;
		if(month==months)
		    return salary+100;
		else
			return 0;
	}

}

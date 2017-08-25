package Comparator;

import java.util.Comparator;

public class StuOrderbyScore implements Comparator<Stu>{



	@Override
	public int compare(Stu a, Stu b) {
		// TODO Auto-generated method stub
		if(a.getScore()>b.getScore())
			return 1;
		else if(a.getScore()<b.getScore())
			return -1;
		else
		    return 0; 
	}
	

}

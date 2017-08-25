package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Stu> stus=new ArrayList<Stu>();
		Stu stu1=new Stu("a",90);
		Stu stu2=new Stu("b",80);
		Stu stu3=new Stu("c",85);
		stus.add(stu1);
		stus.add(stu2);
		stus.add(stu3);
		Collections.sort(stus, new Comparator<Stu>() {
			@Override
			public int compare(Stu a, Stu b) {
				if(a.getScore()>b.getScore())
					return 1;
				else if(a.getScore()<b.getScore())
					return -1;
				else
				    return 0;
			}			
		});
		for (Stu stu : stus) {
			System.out.println(stu);
		}

	}

}

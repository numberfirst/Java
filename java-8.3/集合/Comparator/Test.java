package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Stu> stus=new ArrayList<Stu>();
		Stu stu1=new Stu("a",90);
		Stu stu2=new Stu("b",80);
		Stu stu3=new Stu("c",85);
		stus.add(stu1);
		stus.add(stu2);
		stus.add(stu3);
		StuOrderbyScore s=new StuOrderbyScore();
		Collections.sort(stus, s);
		for (Stu stu : stus) {
			System.out.println(stu);
		}
		

	}

}

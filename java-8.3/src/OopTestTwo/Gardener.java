package OopTestTwo;

import java.util.Scanner;

public class Gardener {
	public void creater() {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(s.equals("苹果"))
			new Apple();
		else if(s.equals("香蕉"))
			new Banana();
		else if(s.equals("葡萄"))
			new Grape();
		else
			System.out.println("请输入正确的对象");
	}

}

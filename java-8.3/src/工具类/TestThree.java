package 工具类;

import java.util.Arrays;
import java.util.List;

public class TestThree {

	public static void main(String[] args) {
		String str="abcdefg";
		System.out.println(str.substring(2, 4));
		char[] c=str.toCharArray();
		List list=Arrays.asList(c);
		int min=2;
		int max=5;
		double i= min+Math.random()*(max-min);
		System.out.println(i);

	}

}

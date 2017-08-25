package 工具类;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String s4="123";
		int i4=Integer.parseInt(s4);
		System.out.println(i4);
		
		
		String s="Abc";
		
		byte[] b=s.getBytes();
		for(byte i:b) {
			System.out.println(i);
		}

		String s1=new String(b);
		System.out.println(s1);
		char[] c=s1.toCharArray();
		for (char d : c) {
			System.out.println(d);
		}
		String s2=new String(c);
		System.out.println(s2);
		
		int i=100;
		String str=String.valueOf(i);
		System.out.println(str);
		Date date=new Date();
		System.out.println(date);
		
		int a=date.getHours();
		System.out.println(a);
		
		
		Scanner sc=new Scanner(System.in);
		String sr=sc.nextLine();
		String sr1=sc.nextLine();
		sr+=sr1;
		System.out.println(sr);
		char[] c1=sr.toCharArray();
		int i1=0;
		for (char d : c1) {
			if(d=='e')
				i1++;
		}
		System.out.println(i1);
		
		Random random=new Random();
		int[] num=new int[10];
		for(int j=0;j<num.length;j++) {
			num[j]=random.nextInt(100);
			System.out.println(num[j]);
		}
		
	}
	

}

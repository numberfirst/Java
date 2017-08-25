import java.util.Scanner;

public class TestEight {

	public static void main(String[] args) {
		System.out.print("请输入一个四位的整数：");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int a=i/1000;
		int b=i%1000/100;
		int c=i%1000%100/10;
		int d=i%1000%100%10;
		int j=d*1000+c*100+b*10+a;
		System.out.print("反转后的数是："+j);

	}

}

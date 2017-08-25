import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.print("请输入一个人大于1的自然数：");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int factorial=1;
		for(int i=1;i<=x;i++) {
			factorial*=i;
		}
		System.out.print("这个数的阶乘是："+factorial);

	}

}

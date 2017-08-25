import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入你的本金：");
		double principal=sc.nextDouble();
		for(int i=1;i<=5;i++) {
			principal+=principal*3/1000;
		}
		System.out.println("5年后您获得的本金是："+principal);

	}

}

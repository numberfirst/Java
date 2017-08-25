import java.util.Scanner;

public class TestSix {

	public static void main(String[] args) {
		System.out.println("请输入一个0~100的整数：");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int n=a/10;
		switch(n) {
		case 6: System.out.print("D"); break;
		case 7: System.out.print("C"); break;
		case 8: System.out.print("B"); break;
		case 9:
		case 10: System.out.print("A"); break;
		default: System.out.print("E"); break;
		}
	}

}

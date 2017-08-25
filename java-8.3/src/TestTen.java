import java.util.Scanner;

public class TestTen {

	public static void main(String[] args) {
		System.out.print("请输入年份：");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		judgeYear(n);

	}
	public static void judgeYear(int n) {
		if((n%4==0&&n%100!=0)||n%400==0) {
			System.out.println("该年是闰年！");
		}
		else {
			System.out.println("该年是平年！");
		}
	}

}

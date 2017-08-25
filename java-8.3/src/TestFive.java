import java.util.Scanner;

public class TestFive {

	public static void main(String[] args) {
		double j=0.0;
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入本月利润：");
		double d=sc.nextDouble();
		if(d<=10&&d>0) {
			j=d*10/100;
		}
		if(d>10&&d<=20) {
			j=10*10/100+(d-10)*7.5/100;			
		}
		if(d>20&&d<=40) {
			j=10*10/100+10*7.5/100+(d-20)*5/100;
		}
		if(d>40&&d<=60) {
			j=10*10/100+10*7.5/100+20*5/100+(d-40)*3/100;
		}
		if(d>60&&d<=100) {
			j=10*10/100+10*7.5/100+20*5/100+20*3/100+(d-60)*1.5/100;
		}
		if(d>100) {
			j=10*10/100+10*7.5/100+20*5/100+20*3/100+40*1.5/100+(d-100)*1/100;
		}
		System.out.print("应发放的奖金数为："+j);

	}

}

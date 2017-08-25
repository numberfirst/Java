import java.util.Scanner;

public class Rhombus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {		
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int x=1;x<=i*2-1;x++) {
				if(x==1||x==i*2-1) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		for(int a=1;a<=n-1;a++) {
			for(int b=1;b<=a;b++) {
				System.out.print(" ");
			}
			for(int c=1;c<=2*(n-1)-(2*a-1);c++) {
				if(c==1||c==2*(n-1)-(2*a-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
			
		

	}

}


public class House {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int x=1;x<=4;x++) {
				System.out.print("*");
			}
			for(int x=1;x<=i*2-1;x++) {
				if(x==1||x==i*2-1) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("\n");			
		}
		for(int y=1;y<=n;y++) {
			for(int z=1;z<=14;z++) {
			 if(y==1||y==n||z==1||z==14) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("\n");
		}

	}

}

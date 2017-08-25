package ArrayTest;

public class JundgeExistence {

	public static void main(String[] args) {
		int[] a= {1,3,5,7,6};
		int n=2;
		boolean b=jundgeExistence(a,n);
		System.out.println(b);

	}
	static boolean jundgeExistence(int[] a,int n) {
		boolean b=false;
		for(int i=0;i<a.length;i++) {
			if(n==a[i]) {
				b=true;
			}
		}		
		return b;
		
	}

}

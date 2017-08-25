package ArrayTest;

public class ArrayRemove {

	public static void main(String[] args) {
		int[] a= {1,2,4,5,7};
		int n=2;
		int[] result=arrayRemove(a,n);
		for(int j:result) {
			System.out.println(j);
		}

	}
	static int[] arrayRemove(int[] a,int n) {
		int[] result= new int[a.length-1];
		for(int i=n;i<a.length-1;i++) {
			a[i]=a[i+1];
		}
		System.arraycopy(a, 0, result, 0, a.length-1);
		return result;
		
	}

}

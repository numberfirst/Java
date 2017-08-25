package ArrayTest;

public class ArrayIndex {

	public static void main(String[] args) {
		int[] a= {1,3,4,6,7,2};
		int n=6;
		int x=arrayIndex(a,n);
		System.out.println(x);
	}
	static int arrayIndex(int[] a,int n) {
		int i=-1;
		for(i=0;i<a.length;i++) {
			if(a[i]==n) {
				break;
			}
		}
		return i;
	}
}

package ArrayTest;

public class ArrayAdd {

	public static void main(String[] args) {
		int[] a= {2,4,5,7,3};
		int[] b= {8,9};
		int i=1;
		int[] result=arrayAdd(a,i,2);
		for(int j:result) {
			System.out.println(j);
		}
		result=arrayAdd(a,b);
		for(int j:result) {
			System.out.println(j);
		}
	}
	public static int[] arrayAdd(int[] a,int[] b) {
		int[] result= new int[a.length+b.length];
		System.arraycopy(a, 0, result, 0, a.length);
		System.arraycopy(b, 0, result, a.length, b.length);
		return result;		
	}
	public static int[] arrayAdd(int[] a,int i,int n) {
		int[] result= new int[a.length+1];
		System.arraycopy(a, 0, result, 0, n);
		result[n]=i;
		System.arraycopy(a, n, result, n+1, a.length-n);
		return result;		
	}

}

package ArrayTest;

public class TestThree {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7};
		int t;
		for(int i=0;i<a.length/2;i++) {
			t=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=t;
		}
		for(int i:a) {
			System.out.println(i);
		}
		
		

	}

}

package ArrayTest;

public class TestFour {

	public static void main(String[] args) {
		int[] a= {1,2,3,3,1,5,6,7,5};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					a[j]=0;
				}
			}
		}
		for(int i:a) {
			System.out.println(i);
		}

	}

}


public class TestBubble {

	public static void main(String[] args) {
		int[] a=new int[] {1,6,2,3,9,4,5,7,8};
		int temp;
		for(int i=1;i<a.length;i++) {
			for(int j=0;j<a.length-i;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int x=0;x<a.length;x++) {
			System.out.println(a[x]);
		}

	}

}

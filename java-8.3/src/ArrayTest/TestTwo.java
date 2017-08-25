package ArrayTest;

import ArrayFunction.MyArrayUtils;

public class TestTwo {

	public static void main(String[] args) {
		int[] a= {18,25,7,36,13,2,89,63};
		int t=a[0],i;
		for(i=0;i<a.length-1;i++) {
			if(a[i+1]>t) {
				t=a[i+1];
			}
		}
		System.out.println(t+" "+i);
		MyArrayUtils.printArr(a);

	}

}

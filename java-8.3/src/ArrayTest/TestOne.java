package ArrayTest;

import java.util.Arrays;

public class TestOne {

	public static void main(String[] args) {
		int[] a= {5,2,6,8,3};
		int[] b= {1,4,9,7};
		System.arraycopy(a, 1, b, 2, 2);
		for(int i:b) {
			System.out.println(i);
		}
		Arrays.sort(b,1,3);
		for(int i:b) {
			System.out.println(i);
		}

	}

}

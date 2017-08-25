package ArrayTest;

public class TestFive {

	public static void main(String[] args) {
		int[] a= {-10,2,3,246,-100,0,5};
		int min=a[0],max=a[0],sum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
			if(a[i]>max) {
				max=a[i];
			}
			sum+=a[i];
		}
		double d=(double)sum/a.length;
		System.out.println("平均值："+d+"最大值："+max+"最小值："+min);

	}

}

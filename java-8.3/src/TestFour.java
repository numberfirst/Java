
public class TestFour {

	public static void main(String[] args) {
		int i=1,sum=0,sum1=0;
		while(i<100) {
			if(i%2==0) {
				sum+=i;
			}
			if(i%2==1) {
				sum1+=i;
			}
			i++;
		}
		System.out.println("100以内的偶数和为："+sum+"\n"+"100以内的奇数和为："+sum1);

	}

}

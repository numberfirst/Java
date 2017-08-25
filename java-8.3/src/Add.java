
public class Add {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%10!=3) {
				sum=sum+i;
			}
		}
		System.out.print("所得到的和为："+sum);

	}

}

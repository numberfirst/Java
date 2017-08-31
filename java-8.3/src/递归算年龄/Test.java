package 递归算年龄;

public class Test {

	public static void main(String[] args) {
		for(int i=1;i<=8;i++)
		System.out.println(getAge(i));

	}
	public static int getAge(int n) {
		if(n==1)
			return 10;
		else
			return 2+getAge(n-1);
		
	}

}

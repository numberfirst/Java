public class Test {

	public static void main(String[] args) {
		System.out.println("Hello");		
		int y,x=1123;
		y=x/1000+x%1000/100+x%1000%100/10+x%1000%100%10;
		System.out.println(y);		
		char c1='C';
		char c2=(char)(c1+32);
		System.out.println(c2);
		int a=1,b=2,tmp;
		System.out.println(a+","+b);
		tmp=a;
		a=b;
		b=tmp;
		System.out.println(a+","+b);
	}

}

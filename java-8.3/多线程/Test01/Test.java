package Test01;

public class Test {

	public static void main(String[] args) {
		Thread t1=new Thread(new Boil());
		Thread t2=new Thread(new Wash());
		t1.start();
		t2.start();

	}

}

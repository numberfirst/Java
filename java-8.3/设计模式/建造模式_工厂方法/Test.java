package 建造模式_工厂方法;

public class Test {
	public static void main(String[] args) {
		Factory factory=new CarFactory();
		Products car=factory.factory();
	}

}

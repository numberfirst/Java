package 结构模式_适配器模式;

public class Test {

	public static void main(String[] args) {
		Adaptee adaptee110V=new Adaptee110V();
		
		Computer computer=new Computer(adaptee110V);
		computer.learn();
		computer.useSupply();
		

	}

}

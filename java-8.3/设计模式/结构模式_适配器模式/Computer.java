package 结构模式_适配器模式;

public class Computer implements Target{
	private Adaptee adaptee;
	public Computer(Adaptee adaptee) {
		this.adaptee=adaptee;
	}

	@Override
	public void learn() {
		System.out.println("开始学习...");
		
	}

	@Override
	public void useSupply() {
		
		adaptee.powerSupply();
	}
	
	
	

}

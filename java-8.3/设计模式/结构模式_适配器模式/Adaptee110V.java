package 结构模式_适配器模式;

public class Adaptee110V implements Adaptee{

	@Override
	public void powerSupply() {
		System.out.println("提供110V的电");
		
	}

}

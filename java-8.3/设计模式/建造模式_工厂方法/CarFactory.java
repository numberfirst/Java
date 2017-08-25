package 建造模式_工厂方法;

public class CarFactory implements Factory{

	@Override
	public Products factory() {
		return new Car();
	}

}

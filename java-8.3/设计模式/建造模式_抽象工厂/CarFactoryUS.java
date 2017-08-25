package 建造模式_抽象工厂;

public class CarFactoryUS implements Factory{

	@Override
	public CarA factoryCarA() {
		return new CarA_US();
	}

	@Override
	public CarB factoryCarB() {
		return new CarB_US();
	}

}

package 建造模式_抽象工厂;

public class CarFactoryCN implements Factory {

	@Override
	public CarA factoryCarA() {
		
		return new CarA_CN();
	}

	@Override
	public CarB factoryCarB() {
		
		return new CarB_CN();
	}

}

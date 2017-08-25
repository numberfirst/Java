package 建造模式_工厂方法;

public class BusFactory implements Factory{

	@Override
	public Products factory() {
		return new Bus();
	}

}

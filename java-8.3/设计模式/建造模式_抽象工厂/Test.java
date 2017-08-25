package 建造模式_抽象工厂;

public class Test {

	public static void main(String[] args) {
		Factory factoryCN=new CarFactoryCN();
		CarA carA=factoryCN.factoryCarA();
		Factory factoryUS=new CarFactoryUS(); 
		CarB carB=factoryUS.factoryCarB();

	}

}

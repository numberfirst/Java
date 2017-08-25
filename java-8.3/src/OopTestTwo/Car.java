package OopTestTwo;

public class Car extends Vehicle{
	private int loader;
	public Car(String brand,String color,int loader) {
		super(brand,color);
		this.loader=loader;
	}

	


	public int getLoader() {
		return loader;
	}


	public void setLoader(int loader) {
		this.loader = loader;
	}
	public void run() {
		System.out.println("轿车奔跑的速度是"+getSpeed());
	}
	

}

package OopTest;

public class Vehicle {
	private String brand;
	private String color;
	private double speed;
	public Vehicle(String brand,String color) {
		this.brand=brand;
		this.color=color;
		speed=0;
	}
	public String getBrand() {
		return brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public void run() {
		System.out.println("汽车奔跑的速度是"+getSpeed());
	}

}

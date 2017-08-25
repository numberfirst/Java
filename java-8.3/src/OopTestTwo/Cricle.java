package OopTestTwo;

public class Cricle extends Shape{
	private double radius;
	public Cricle() {}
	public Cricle(double radius,String color) {
		super(color);
		this.radius=radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	public double getPer() {
		return 3.14*2*radius;
	}
	public void showAll() {
		System.out.println(radius+" "+getArea()+" "+getPer()+" "+super.getColor());
	}

}

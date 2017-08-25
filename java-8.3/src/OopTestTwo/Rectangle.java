package OopTestTwo;

public class Rectangle extends Shape{
	private double width;
	private double height;
	public Rectangle() {}
	public Rectangle(double width,double height,String color) {
		super(color);
		this.height=height;
		this.width=width;
	}
	public double getArea() {
		return width*height;
	}
	public double getPer() {
		return (width+height)*2;
	}
	public void showAll() {
		System.out.println(width+" "+height+" "+getArea()+" "+getPer()+" "+super.getColor());
	}

}

package OopTestTwo;

public class Shape {
	private double area;
	private double per;
	private String color;
	public Shape() { }
	public Shape(String color) {
		this.color=color;
	}
	public double getArea() {
		return area;
	}
	public double getPer() {
		return per;
	}
	public void showAll() {
		System.out.println(area+" "+per+" "+color);
	}
	public String getColor() {
		return color;
	}

}

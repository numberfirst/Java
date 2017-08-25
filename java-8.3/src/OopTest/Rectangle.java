package OopTest;

public class Rectangle {
	public int length;
	public int width;
	public Rectangle(int width,int length) {
		this.width=width;
		this.length=length;
	}
	public int getArea() {
		int area=width*length;
		return area;
	}
	public int getPer() {
		int per=(length+width)*2;
		return per;

	}
	public void showAll() {
		System.out.println(length+" "+width+" "+getArea()+" "+getPer());
	}

}

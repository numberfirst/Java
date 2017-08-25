package OopTest;

public class Point {

	public int x;
	public int y;
	public Point() {}
	public Point(int x0,int y0) {
		x=x0;
		y=y0;
	}
	public void movePoint(int dx,int dy) {
		x+=dx;
		y+=dy;
		System.out.println(x+" "+y);
	}

}

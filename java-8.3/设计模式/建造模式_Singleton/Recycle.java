package 建造模式_Singleton;

public class Recycle {
//	饿汉式
	private  static Recycle recycle=new Recycle();
	private Recycle() {
		
	}
	public static Recycle getInstance() {
		return recycle;
	}

}

package 建造模式_Singleton;

public class RecycleTwo {
//	懒汉式
	private static RecycleTwo recycle;
	private RecycleTwo() {
		
	}
	public static RecycleTwo getInstance() {
		if(recycle==null)
			recycle=new RecycleTwo();
		return recycle;
	}

}

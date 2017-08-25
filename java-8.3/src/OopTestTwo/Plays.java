package OopTestTwo;

public class Plays {
	static int sum=0;
	private Plays() {
		
	}
	public static Plays create() {
		sum++;
		if(sum<=11) {
			System.out.println("创建了一个对象");
			return new Plays();
		}
		else {
			System.out.println("对不起，已经创建了11个对象，不能再创建了");
			return null;
		}
	}

}

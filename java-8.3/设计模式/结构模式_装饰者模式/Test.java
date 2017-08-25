package 结构模式_装饰者模式;

public class Test {

	public static void main(String[] args) {
		Swift monkeyKing=new MonkeyKing();
		Fish fish=new Fish(monkeyKing);
		fish.action();
	

	}

}

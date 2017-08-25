package 结构模式_装饰者模式;

public class Decorator {
	private Swift swift;
	public Decorator(Swift swift) {
		this.swift=swift;
	}
	public void action() {
		swift.fly();
	}

}

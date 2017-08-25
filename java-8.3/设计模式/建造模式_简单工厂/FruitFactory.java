package 建造模式_简单工厂;

public class FruitFactory {
	public static Fruit produceFruit(String string) {
		if("apple".equals(string)) {
			return new Apple();
		}else {
			return null;
		}
		
	}

}

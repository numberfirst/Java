
public abstract class TestTwo {

	public static void main(String[] args) {
		int x,y,z;
		for(x=0;x<=20;x++) {
			for(y=0;y<=33;y++) {
				for(z=0;z<=100;z++)
				if(x+y+z==100&&5*x+3*y+z/3==100&&z%3==0) {
					System.out.println("公鸡："+x+"母鸡："+y+"雏鸡："+z);
				}
			}
		}

	}

}

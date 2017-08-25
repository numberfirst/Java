
public class TestThree {

	public static void main(String[] args) {
		int x,y,z;
		for(x=0;x<=33;x++) {
			for(y=0;y<=50;y++) {
				for(z=0;z<=100;z++) {
					if(x+y+z==100&&(3*x+2*y+z/2)==100&&z%2==0) {
						System.out.println("大马："+x+"中马："+y+"小马："+z);
					}
				}					
			}
		}

	}

}

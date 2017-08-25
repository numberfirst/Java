
public class TestSenve {

	public static void main(String[] args) {
		int x=201,i;
		for(;x>200;x++) {
			for(i=2;i<=x;i++) {
				if(x%i==0)
					break;
			}
			if(x==i) {
				System.out.println(x);
				break;
			}
		}

	}

}

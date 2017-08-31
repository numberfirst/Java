package Test01;

public class Boil extends Thread{
	@Override
	public void run() {
		System.out.println("开始烧水...");
		
		try {
			Thread.sleep(10*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("水开了...");
		
	}

}

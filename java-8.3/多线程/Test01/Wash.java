package Test01;

public class Wash implements Runnable{

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("开始洗第"+i+"个杯子...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}

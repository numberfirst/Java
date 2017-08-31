package Test02;

public class SellThread implements Runnable{
	int tickets=100;

	@Override
	public  void run() {
		// TODO Auto-generated method stub
		while(true) {
			synchronized (this) {
				if(tickets>0) {
					 System.out.println(Thread.currentThread().getName()+":"+tickets);					 
					 --tickets;
			 }
			 else {
				 break;
			 }
			}
				 
		}
			
	}


	

}

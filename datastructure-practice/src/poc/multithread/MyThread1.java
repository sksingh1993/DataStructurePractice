package poc.multithread;

public class MyThread1 extends Thread{
	
	public void run() {
		for(int i=1;i<=20;i++) {
			System.out.println("Mythread"+i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	

}

package poc.multithread;

public class TestThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThread1 mt=new MyThread1();
		mt.setName("Mythread");
		mt.start();
		mt.join(999999999);
		//Thread.currentThread().join();
		//System.out.println(mt.isAlive());
		//System.out.println(Thread.currentThread().isAlive());
		
		for(int i=1;i<=20;i++) {
			System.out.println(Thread.currentThread() +"\t"+ i);
		}
		
		System.out.println(mt.isAlive());
		System.out.println(Thread.currentThread().isAlive());

	}

}

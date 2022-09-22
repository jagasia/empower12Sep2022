
public class App {

	public static void main(String[] args) throws InterruptedException {
		MyThread t1=new MyThread();
		t1.setName("Thread 1");
		MyThread t2=new MyThread();
		t2.setName("T2");
		MyThread t3=new MyThread();
		t3.setName("Third thread");
		MyThread t4=new MyThread();
		t4.setName("Thread four");
		
		t1.start();
		t2.start();		 
		t3.start();
		t1.join();
		t4.start();
		
	}

}

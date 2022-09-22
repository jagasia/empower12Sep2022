
public class App {

	public static void main(String[] args) throws InterruptedException {
		Mathematics m=new Mathematics();
//		m.display();
		MyThread t1=new MyThread(m);
		t1.setName("First thread");
		
		MyThread t2=new MyThread(m);
		t2.setName("Thread 2");
		
		t1.start();
		t2.start();
	}

}

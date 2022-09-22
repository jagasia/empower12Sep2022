
public class App1 {
	public static void display() throws InterruptedException
	{
		for(int i=0;i<20;i+=2)
		{
			System.out.println("hello");
			Thread.sleep(1000);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		OddThread t1=new OddThread();
		EvenThread t2=new EvenThread();
		t1.start();
		t2.start();
		display();
	}

}

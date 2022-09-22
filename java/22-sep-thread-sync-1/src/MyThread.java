
public class MyThread extends Thread{
	public void run()
	{
		while(true)
		{
			System.out.println(Thread.currentThread().getName()+" is running");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

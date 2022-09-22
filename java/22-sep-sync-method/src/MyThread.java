
public class MyThread extends Thread
{
	Mathematics m;
	
	public MyThread(Mathematics m)
	{
		this.m=m;
	}
	public void run()
	{	
		try {
			m.display();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

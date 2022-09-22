
public class EvenThread extends Thread
{
	public void run()
	{
		for(int i=2;i<=20;i+=2)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

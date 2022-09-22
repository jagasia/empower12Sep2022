
public class Mathematics {
	public void display() throws InterruptedException
	{
		System.out.println(Thread.currentThread().getName()+" has entered the display method");
Thread.sleep(1000);
		System.out.println(Thread.currentThread().getName()+" is going to enter the sync block");
	
		synchronized (this) {
			for(int i=0;i<20;i++)
			{
				System.out.println(Thread.currentThread().getName()+" is running");
				Thread.sleep(1000);
			}
		}
		
		System.out.println(Thread.currentThread().getName()+" has exited the sync block");
		Thread.sleep(1000);
		System.out.println(Thread.currentThread().getName()+" has completed the display method");
	}
}

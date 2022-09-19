
public class ExceptionDemo1 {

	public static void main(String[] args)  {
		for(int i=0;i<20;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch(Exception ex)
			{
				System.out.println("This is exception catch");
			}
			finally
			{
				
			}
		}
	}

}

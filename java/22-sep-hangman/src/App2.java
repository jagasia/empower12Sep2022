import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("What is the capital of India");
//		TimerThread t=new TimerThread();
		Thread t=new Thread(()->{
			
			for(int i=1;i<=10;i++)
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			System.out.println("Failed.");
			System.exit(0);
			
		});
		t.start();
		do
		{
			String input=sc.nextLine();
			
			if(input.equalsIgnoreCase("new delhi"))
			{
				System.out.println("Congratulations");
				t.stop();
				break;				
			}else
			{
				System.out.println("Answer is wrong");
			}
		}while(true);
	}

}

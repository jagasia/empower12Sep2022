import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("What is the capital of India");
		TimerThread t=new TimerThread();
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

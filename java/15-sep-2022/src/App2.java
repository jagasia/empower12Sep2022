import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		//lets learn to use if condition
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no1:");
		int no1=sc.nextInt();
		System.out.println("Enter no2:");
		int no2=sc.nextInt();
		System.out.println("What do you want to do? Add/ Subtract");
		String op=sc.next();
		
		if(op.equalsIgnoreCase("Add"))
		{
			System.out.println(no1+no2);
		}
		else
		{
			System.out.println(no1-no2);
		}
		
		
	}

}

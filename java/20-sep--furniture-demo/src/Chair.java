import java.util.Scanner;

public class Chair extends Furniture{
	private int noOfLegs;
	
	public void acceptDetails()	//overriding hides the super class functionality
	{
		super.acceptDetails();
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Number of Legs:");
		noOfLegs=sc.nextInt();
	}
	
	public void displayDetails()
	{
		super.displayDetails(); 		//super can be used only in the 1st line
		System.out.println("Number of legs:"+noOfLegs);
	}
}

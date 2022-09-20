import java.util.Scanner;

public class BookShelf extends Furniture{
	private int noOfShelves;
	public void acceptDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("No of shelves:");
		noOfShelves=sc.nextInt();
	}
	public void displayDetails()
	{
		System.out.println("Number of shelves:"+noOfShelves);
	}
}

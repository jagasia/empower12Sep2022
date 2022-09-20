import java.util.Scanner;

public class Furniture {
	private String name;
	private String color;
	
	public void acceptDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		name=sc.nextLine();
		System.out.println("Enter the color:");
		color=sc.nextLine();
	}
	
	public void displayDetails()
	{
		System.out.println("Name:"+name);
		System.out.println("Color:"+color);
	}
}

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("What do you want to buy?\n1: Chair\r\n" + 
				"2: Book shelf\r\n" + 
				"");
		int choice=sc.nextInt();
		Furniture f=null;
		switch(choice)
		{
		case 1:		//chair
			f=new Chair();
			break;
		case 2:		//bookshelf
			f=new BookShelf();
			break;
		}
		
		f.acceptDetails();
		f.displayDetails();
	}

}

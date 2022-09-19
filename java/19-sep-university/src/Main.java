import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		University university=new University();
		System.out.println("Enter the name of the University:");
		String universityName=sc.nextLine();
		university.setName(universityName);
		int choice=0;
		do
		{
		System.out.println("1.Add College \r\n" + 
				"2.Delete College \r\n" + 
				"3.Display Colleges \r\n" + 
				"4.Exit \r\n" + 
				"");
		
		System.out.println("Enter your choice: ");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:	//Add college
			String detail=sc.nextLine();
			if(detail.equals(""))
				detail=sc.nextLine();
			College college = College.createCollege(detail);
			university.addCollegeToUniversity(college);
			System.out.println("College successfully added ");
			break;
		case 2:	//Delete college
			System.out.println("Enter the name of the college to be deleted: ");
			String name=sc.nextLine();
			if(name.equals(""))
				name=sc.nextLine();
			if(university.removeCollege(name))
			{
				System.out.println("College successfully deleted");
			}else
			{
				System.out.println("College not found in the University");
			}
			break;
		case 3:	//Display college
			System.out.println("Colleges in "+university.getName());
			university.displayColleges();
			break;		
		}
		
		}while(choice<4);
	}

}

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class App_Req1 {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter contact 1 detail:");
		String input1=sc.nextLine();
		System.out.println("Enter contact 2 detail:");
		String input2=sc.nextLine();
		System.out.println();
		String[] arr1 = input1.split(",");
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Contact contact1=new Contact(arr1[0], arr1[1], arr1[2], sdf.parse(arr1[3]));
		String []arr2=input2.split(",");
		Contact contact2=new Contact(arr2[0],arr2[1],arr2[2],sdf.parse(arr2[3]));
		System.out.println("Contact 1");
		System.out.println(contact1);
		
		System.out.println();
		
		System.out.println("Contact 2");
		System.out.println(contact2);
		
		if(contact1.equals(contact2)) 
			System.out.println("Contact 1 is same as Contact 2");
		else
			System.out.println("Contact 1 and Contact 2 are different");	
		
	}

}

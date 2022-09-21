import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class App_ObjectOutputStream {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("Id:");
		Integer id=sc.nextInt();
		
		System.out.println("Name:");
		String name=sc1.nextLine();
		System.out.println("Salary:");
		Double salary=sc.nextDouble();
		
		Employee emp=new Employee(id, name, salary);
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("emp.dat"));
		oos.writeObject(emp);
		oos.flush();
		oos.close();
		
		System.out.println("Done");
	}

}

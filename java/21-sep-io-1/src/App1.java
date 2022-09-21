import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App1 {

	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("D:\\Jag\\Empower\\all\\notes\\yash.txt");
		Scanner sc=new Scanner(f);
		String input=sc.nextLine();
		System.out.println(input);
	}

}

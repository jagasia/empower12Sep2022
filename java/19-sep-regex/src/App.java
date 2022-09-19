import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
//		System.out.println(input);
		Pattern p = Pattern.compile("E[0-9]{3}");
		Matcher m = p.matcher(input);
		while(m.find())
		{
			System.out.println(m.group());
		}
	}

}

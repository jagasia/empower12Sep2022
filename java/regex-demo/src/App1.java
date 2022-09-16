import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//accept a string input and check if it has only number and also 5 digits
		String input=sc.next();
		System.out.println(input.matches("\\d{5}"));
	}

}

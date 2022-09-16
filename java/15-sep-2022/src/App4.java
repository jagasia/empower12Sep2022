import java.util.Scanner;

public class App4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char input=sc.next().toLowerCase().charAt(0);
		switch(input)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Not vowel");
			break;
		}
	}

}

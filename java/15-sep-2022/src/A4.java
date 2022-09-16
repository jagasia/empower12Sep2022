import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char input=sc.next().toLowerCase().charAt(0);
		
		if(input=='a' || input=='e' || input=='i' || input=='o' ||input=='u')
		{
			System.out.println("Vowel");
		}else
		{
			System.out.println("Not Vowel");
		}
	}

}

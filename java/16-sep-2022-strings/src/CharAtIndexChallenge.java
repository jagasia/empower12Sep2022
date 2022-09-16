import java.util.Scanner;

public class CharAtIndexChallenge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		int index=sc.nextInt();
		if(index<0)
		{
			System.out.println("Invalid");
		}
		else
		{
			System.out.println(input.charAt(index%input.length()));
		}
	}

}

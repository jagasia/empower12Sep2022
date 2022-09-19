import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		String input1=input.toLowerCase();
		//check if input1 is a palindrome or not.
		String reverse="";
		StringBuilder sb=new StringBuilder(input1);
		reverse=sb.reverse().toString();
		if(input1.equals(reverse))
		{
			System.out.println(input+" is a palindrome");
		}else
		{
			System.out.println(input+" is not a palindrome");
		}
	}

}

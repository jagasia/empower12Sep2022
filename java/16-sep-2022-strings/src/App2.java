import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		//convert the string into char array and loop
//		char[] arr = input.toCharArray();
//		for(int i=0;i<arr.length;i++)
//		{
//			//display the character only if it is a vowel
//			switch(arr[i])
//			{
//			case 'a':
//			case 'e':
//			case 'i':
//			case 'o':
//			case 'u':
//				System.out.print(arr[i]);				
//			}
			
//		}
		
		for(int i=0;i<input.length();i++)
		{
			char c=input.charAt(i);
			switch(c)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.print(c);				
			}
		}
		
	}

}

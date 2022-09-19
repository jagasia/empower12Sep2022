import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input1=sc.next();
		String input2=sc.next();
		char[] carr1 = input1.toCharArray();
		char[] carr2 = input2.toCharArray();
		Arrays.sort(carr1);
		Arrays.sort(carr2);
		
		String output1=new String(carr1);
		String output2=new String(carr2);
		
		System.out.println(input1+" and "+input2 +" are"
				+(output1.equalsIgnoreCase(output2)?" ":" not")
				+ " anagrams");
		
		}
}

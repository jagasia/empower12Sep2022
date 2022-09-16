import java.util.Scanner;

public class DiceGame1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no1, no2;
		System.out.println("Enter Value 1:");
		no1=sc.nextInt();
		System.out.println("Enter Value 2:");
		no2=sc.nextInt();		
		//check if those 2 inputs are valid or not!
		if(no1<0 || no1>6 || no2<0 || no2>6)
		{
			System.out.println("Invalid Input");
			System.exit(0); 		//program terminates
		}		
		int result=no1+no2;
		
		if(no1==no2)
		{
			result*=2;
		}		
		System.out.println(result);
	}

}

import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();	
		if(n<0)
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]<0)
			{
				System.out.println("Invalid Input");
				System.exit(0);
			}
		}

		//solution
		int result=1;
		for(int x:arr)
		{
			//check if the x is a 2 digit number or not
			if(x>9 && x<100)
			{
				result*=x;
			}
		}
		
		System.out.println(result);
	}

}

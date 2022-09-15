import java.util.Scanner;

public class AbundantNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int from=sc.nextInt();
		int to=sc.nextInt();
		boolean isFirst=true;
		boolean nothingFound=true;
		for(int i=from;i<=to;i++)
		{
			//check if "i" is abundant number or not
			int sumOfDivisors=0;
			int j;
			for(j=1;j<=i/2;j++)
			{
				if(i%j==0)
				{
					sumOfDivisors+=j;
				}
			}
			//check if the sumOfDivisors > i
			if(sumOfDivisors>i)
			{
//				System.out.print(i+",");
				if(!isFirst)
				{
					System.out.print(",");
				}
				System.out.print(i);
				nothingFound=false;
				isFirst=false;
			}
		}
		if(nothingFound)
		{
			System.out.println(-1);
		}
	}

}

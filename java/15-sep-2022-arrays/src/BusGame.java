import java.util.Scanner;

public class BusGame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int noOfKids=sc.nextInt();
		int x=sc.nextInt();
		int output=0;
		for(int i=1;true;i++)
		{
			String input=sc.next();
			if(i%x==0)
			{
				//expect Bus here
				if(!input.equals("Bus"))
				{
					output=i%noOfKids;
					break;
				}
			}
		}
		System.out.println(output);
	}

}

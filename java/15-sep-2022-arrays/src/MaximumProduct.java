import java.util.Arrays;
import java.util.Scanner;

public class MaximumProduct {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		int max=arr[size-1];
		boolean flag=false;
		for(int i=0;i<size;i++)
		{
			int result=0;
			
				result=max/arr[i];
				//check if this result is found in array
				for(int j=0;j<size;j++)
				{
					if(result==arr[j])
					{
						//found
						flag=true;
						break;
					}
				}
			
		}
		if(flag)
		{
			System.out.println(max);
		}else
		{
			System.out.println(-1);
		}
	}

}

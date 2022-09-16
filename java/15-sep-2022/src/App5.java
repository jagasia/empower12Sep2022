import java.util.Scanner;

public class App5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no1, no2, no3;
		no1=sc.nextInt();
		no2=sc.nextInt();
		no3=sc.nextInt();

		int largest=no1;
		if(no2>largest)
			largest=no2;
		if(no3>largest)
			largest=no3;
		
		
		System.out.println(largest);
		
//		if(no1>no2)
//				if(no1>no3)
//					System.out.println(no1);
//				else
//					System.out.println(no3);
//		else if(no2>no3)
//			System.out.println(no2);
//		else
//			System.out.println(no3);
//			
//		
		
//		if(no1>no2 && no1>no3)
//			System.out.println(no1);
//		else if(no2>no1 && no2>no3)
//			System.out.println(no2);
//		else
//			System.out.println(no3);
		
//		int largest=Integer.MIN_VALUE;
//		if(no1>largest)		
//			largest=no1;		
//		if(no2>largest)
//			largest=no2;
//		if(no3>largest)
//			largest=no3;
//		
//		System.out.println(largest);
	}

}

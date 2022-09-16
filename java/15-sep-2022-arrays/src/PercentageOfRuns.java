import java.util.Scanner;

public class PercentageOfRuns {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int total=sc.nextInt();
		int fours=sc.nextInt();
		int sixers=sc.nextInt();
		int boundaries=0;
		boundaries+=fours*4;
		boundaries+=sixers*6;
		
		int runs=total-boundaries;
		float pct=(float)runs/total*100;
		System.out.printf("%.2f",pct);
		
	}

}

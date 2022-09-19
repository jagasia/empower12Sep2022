import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of calls:");
		int noOfCalls=sc.nextInt();
		List<Call> callList=new ArrayList<Call>();
		SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat sdf1=new SimpleDateFormat("dd-MM-yyyy");

		for(int i=0;i<noOfCalls;i++)
		{
			String input=sc.nextLine();
			if(input.equals(""))
				input=sc.nextLine();
			String[] arr = input.split(",");
//			John,Incoming,STD,00:01:50,02-05-2018
			Call call=new Call(arr[0], arr[1], arr[2], sdf.parse(arr[3]), sdf1.parse(arr[4]));
			call.computeCost();
			callList.add(call);
		}
		
		System.out.printf("%-8s %-8s %-10s %-12s %-10s %s\n","Contact","Type","Call Type","Date","Duration","Cost");
		for(Call c:callList)
			 System.out.printf("%-8s %-8s %-10s %-12s %-10s %.2f\n",c.getContactName(),c.getType(),c.getCallType(),sdf1.format(c.getDate()),sdf.format(c.getDuration()),c.getCost());
	}

}

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		List<Contact> contactList = Contact.prefill();
		System.out.println("Enter the number of calls:");
		int noOfCalls=sc.nextInt();
		SimpleDateFormat sdfDuration=new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat sdfDate=new SimpleDateFormat("dd-MM-yyyy");
		List<Call> callList=new ArrayList<Call>();
		for(int i=0;i<noOfCalls;i++)
		{
			String detail=sc.next();
			String[] arr = detail.split(",");
//			Wayne,Incoming,Local,0,00:05:35,10-07-2018
//			contactName,type,cost,allType,duration,date 
			Call call=new Call();
			String contactName=arr[0];
			
			//find contact object from contactList using contactName
			for(Contact contact:contactList)
			{
				if(contact.getName().equals(contactName))
				{
					call.setContact(contact);
					break;
				}
			}
			call.setType(arr[1]);
			call.setCallType(arr[2]);
			call.setCost(Double.valueOf(arr[3]));
			call.setDuration(sdfDuration.parse(arr[4]));
			call.setDate(sdfDate.parse(arr[5]));
			callList.add(call);
		}
		
		Map<String, Integer> result = Call.monthWiseCount(callList);
		System.out.printf("%-10s %s\n","Month", "Count"); 
		for(Entry<String, Integer> e:result.entrySet())
			System.out.printf("%-10s %s\n",e.getKey(), e.getValue()); 
	}

}

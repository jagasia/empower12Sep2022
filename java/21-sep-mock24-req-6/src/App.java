import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws ParseException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of calls:");
		List<Contact> contactList = Contact.prefill();
		int noOfCalls=sc.nextInt();
		SimpleDateFormat sdfDuration=new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat sdfDate=new SimpleDateFormat("dd/MM/yyyy");
		List<Call> callList=new ArrayList<Call>();
		for(int i=0;i<noOfCalls;i++)
		{
			String detail=sc.nextLine();
			if(detail.equals(""))
				detail=sc.nextLine();
//			Incoming,STD,0.25,00:01:50,22/01/2018,John
//			type, callType, cost, duration, date, contactName
			String[] arr = detail.split(",");
			String contactName=arr[5];
			Contact contact=null;
			for(Contact c:contactList)
			{
				if(c.getName().equals(contactName))
					contact=c;
			}
			Call call=new Call(arr[0], arr[1], Double.valueOf(arr[2]), sdfDuration.parse(arr[3]), sdfDate.parse(arr[4]), contact);
			callList.add(call);
		}
		
		CallLog callLog=new CallLog(callList);
		Contact favContact = callLog.getFavouriteContact();
		System.out.println("The favourite contact is "+favContact.getName());
	}

}

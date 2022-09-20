import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class App {

	public static void main(String[] args) throws ParseException {
		List<Contact> contactList = Contact.prefill();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of calls:");
		int noOfCalls=sc.nextInt();
		List<Call> callList=new ArrayList<Call>();
		SimpleDateFormat sdfDuration=new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat sdfDate=new SimpleDateFormat("dd/MM/yyyy");
		for(int i=0;i<noOfCalls;i++)
		{
			String input=sc.nextLine();
			if(input.equals(""))
				input=sc.nextLine();
//			Incoming,STD,0.25,00:01:50,20/06/2018,John
			String[] arr = input.split(",");
			Call call=new Call();
			call.setType(arr[0]);
			call.setCallType(arr[1]);
			call.setCost(Double.valueOf(arr[2]));
//			Date Format : "dd/MM/yyyy"
//			Duration Format : "HH:mm:ss"
			
			call.setDuration(sdfDuration.parse(arr[3]));
			
			call.setDate(sdfDate.parse(arr[4]));
//			arr[5] is the contact Name. Now find the contact object from contactList (obtained from prefill)
			String contactName=arr[5];
			for(Contact contact:contactList)
			{
				if(contact.getName().equalsIgnoreCase(contactName))
				{
					call.setContact(contact);
					break;
				}
				
			}
			callList.add(call);
		}
		
		System.out.println("Enter a search type:\r\n" + 
				"1.By a name\r\n" + 
				"2.By a call date\r\n" + 
				"");
		
		int choice=sc.nextInt();
		CallBO cbo=new CallBO();
		List<Call> result=new ArrayList<>();
		switch(choice)
		{
		case 1:		//by name
			System.out.println("Enter the name:");
			String contactName=sc.nextLine();
			if(contactName.equals(""))
				contactName=sc.nextLine();
			result=cbo.findCall(callList, contactName);
			if(result.size()==0)
				System.out.println("No calls from "+contactName);
			break;
		case 2: 	//by call date
			System.out.println("Enter the call date:");
			String date=sc.nextLine();
			if(date.equals(""))
				date=sc.nextLine();
			Date callDate=sdfDate.parse(date);
			result=cbo.findCall(callList, callDate);
			if(result.size()==0)
				System.out.println("No calls on "+date);
			break;
		default:
			System.out.println("Invalid Choice");
		}
		
		//display the result
		if(result.size()>0)
			System.out.format("%-13s %-15s %-10s %-10s %-10s %-15s %s\n","Name","Mobile Number","Type", "Call Type","Cost" ,"Duration","Date");
		
		for(Call c:result)
		{
			System.out.format("%-13s %-15s %-10s %-10s %.2f %-15s %s\n",c.getContact().getName(),c.getContact().getMobileNumber(),c.getType(),c.getCallType(),c.getCost(),sdfDuration.format(c.getDuration()),sdfDate.format(c.getDate()));
		}
	}

}

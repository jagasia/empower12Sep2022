import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CallLog {
	private List<Call> callList;
	
	public CallLog() {}
	public CallLog(List<Call> callList) {
		super();
		this.callList = callList;
	}
	public List<Call> getCallList() {
		return callList;
	}
	public void setCallList(List<Call> callList) {
		this.callList = callList;
	}
	
	Contact getFavouriteContact()
	{
		//This method returns a Contact that has maximum number of calls 
		//(both incoming and outgoing) to the user from list of Call objects 
		//in the invoking object.
		Map<Contact, Integer> countMap=new HashMap<Contact, Integer>();
		int maxCount=0;
		Contact maxCountContact=null;
		for(Call c:callList)
		{
			Contact contact=c.getContact();
			Integer count=countMap.get(contact);
			if(count==null)
			{
				count=0;
			}
			count++;
			if(count>maxCount)
			{
				maxCount=count;
				maxCountContact=contact;
			}
			countMap.put(contact, count);
		}
		
		return maxCountContact;
	}
}

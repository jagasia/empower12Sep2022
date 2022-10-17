import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class CallBO {
	public List<Call> findCall(List<Call> callList,Date date)
	{
		List<Call> result=new ArrayList<>();
		for(Call c:callList)
		{
			if(c.getDate().equals(date))
			{
				result.add(c);
			}
		}
		return result;
	}
	public List<Call> findCall(List<Call> callList,String contactName)
	{
//		Call call=null;
//		call.getContact();
		List<Call> result=new ArrayList<>();
//		System.out.println("Going to for loop now");
		for(Call c:callList)
		{
			if(c.getContact().getName().equalsIgnoreCase(contactName))
			{
				result.add(c);
			}
		}
		return result;
	}
}

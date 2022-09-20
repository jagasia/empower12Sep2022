import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Call {
	private String type;
	private String callType;
	private Double cost;
	private Date duration;
	private Date date;
	private Contact contact;
	
	public Call() {}

	public Call(Contact contact, String type, String callType, Double cost, Date duration, Date date) {
		super();
		this.type = type;
		this.callType = callType;
		this.cost = cost;
		this.duration = duration;
		this.date = date;
		this.contact = contact;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCallType() {
		return callType;
	}

	public void setCallType(String callType) {
		this.callType = callType;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Date getDuration() {
		return duration;
	}

	public void setDuration(Date duration) {
		this.duration = duration;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public static Map<String,Integer> monthWiseCount(List<Call> callList)
	{
		Map<String,Integer> result=new TreeMap<String, Integer>();
		for(Call c:callList)
		{
//			String month=c.getDate().getMonth();
			SimpleDateFormat sdf=new SimpleDateFormat("MMM");
			String month=sdf.format(c.getDate());
			Integer count = result.get(month);
			if(count==null)
				count=0;
			count++;
			result.put(month, count);
		}
		return result;
	}
}

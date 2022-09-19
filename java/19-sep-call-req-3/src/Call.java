import java.util.Date;

public class Call {
	private String contactName;
	private String type;
	private String callType;
	private Double cost;
	private Date duration;
	private Date date;
	
	public Call() {}

	public Call(String contactName, String type, String callType, Date duration, Date date) {
		super();
		this.contactName = contactName;
		this.type = type;
		this.callType = callType;
		this.duration = duration;
		this.date = date;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
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
	public void computeCost()
	{
		int totalSeconds=0;
		int hours = duration.getHours();
		int minutes=duration.getMinutes();
		int seconds=duration.getSeconds();
		totalSeconds=(hours*60*60)+(minutes*60)+(seconds);
//	 	Incoming Call Cost	Outgoing Call Cost
//	 	Local	0.0	0.9
//	 	STD	0.0	1.2
//	 	ISD	7.5	15.0
//	 	Roaming	0.6	1.2
		if(type.equals("Incoming"))
		{
			switch(callType)
			{
			case "Local":
//				0.0
				cost=totalSeconds*0.0;
				break;
			case "STD":
//				0.0
				cost=totalSeconds*0.0;
				break;
			case "ISD":
//				7.5
				cost=totalSeconds*7.5;
				break;
			case "Roaming":
//				0.6
				cost=totalSeconds*0.6;
				break;
			}
		}else		//Outgoing
		{
			switch(callType)
			{
			case "Local":
//				0.9
				cost=totalSeconds*0.9;
				break;
			case "STD":
//				1.2
				cost=totalSeconds*1.2;
				break;
			case "ISD":
//				15.0
				cost=totalSeconds*15.0;
				break;
			case "Roaming":
//				1.2
				cost=totalSeconds*1.2;
				break;
			}
		}
		cost/=100;
	}
}

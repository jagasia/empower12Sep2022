import java.text.SimpleDateFormat;
import java.util.Date;

public class Contact {
	private String name;
	private String mobileNumber;
	private String mailId;
	private Date dob;
	public Contact() {}
	public Contact(String name, String mobileNumber, String mailId, Date dob) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.mailId = mailId;
		this.dob = dob;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		return String.format("Name: %s\nMobileNumber: %s\nMailId: %s\nDob: %s",name, mobileNumber,mailId, sdf.format(dob));

	}
	@Override
	public boolean equals(Object obj) {
		Contact arg=(Contact) obj;
		return this.getName().equalsIgnoreCase(arg.getName()) && this.getMobileNumber().equalsIgnoreCase(arg.getMobileNumber());
	}
	
}

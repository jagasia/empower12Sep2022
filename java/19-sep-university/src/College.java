import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class College {
	private String name, website, mobile, founder, location;
	private Integer numberOfDept;
	private Date startingDate;
	
	public College() {}

	
	public College(String name, String website, String mobile, String founder, Integer numberOfDept, String location, Date startingDate) {
		super();
		this.name = name;
		this.website = website;
		this.mobile = mobile;
		this.founder = founder;
		this.location = location;
		this.numberOfDept = numberOfDept;
		this.startingDate= startingDate;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getWebsite() {
		return website;
	}


	public void setWebsite(String website) {
		this.website = website;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getFounder() {
		return founder;
	}


	public void setFounder(String founder) {
		this.founder = founder;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public Integer getNumberOfDept() {
		return numberOfDept;
	}


	public void setNumberOfDept(Integer numberOfDept) {
		this.numberOfDept = numberOfDept;
	}

	
	
	public Date getStartingDate() {
		return startingDate;
	}


	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}


	public static College createCollege(String detail)
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		//name,website,mobile,founder,numberOfDept,location,startingDate
		String[] arr = detail.split(",");
		Date startDate=null;
		try {
			startDate=sdf.parse(arr[6]);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new College(arr[0], arr[1], arr[2], arr[3], Integer.valueOf(arr[4]),arr[5], startDate);	
	}
}

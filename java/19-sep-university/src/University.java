import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class University {
	private String name;
	private List<College> collegeList;
	
	public University() {
		collegeList=new ArrayList<College>();
	}
	public University(String name, List<College> collegeList) {
		super();
		this.name = name;
		this.collegeList = collegeList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<College> getCollegeList() {
		return collegeList;
	}
	public void setCollegeList(List<College> collegeList) {
		this.collegeList = collegeList;
	}
	public void addCollegeToUniversity(College college) 
	{
		this.collegeList.add(college);
	}
	public Boolean removeCollege(String name) {
		Iterator<College> it = collegeList.iterator();
		Boolean isFound=false;
		while(it.hasNext())
		{
			College c = it.next();
			if(c.getName().equals(name))
			{
				isFound=true;
				it.remove();
			}
		}
		return isFound;
	}
	public void displayColleges() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		System.out.format("%-15s%-20s%-15s%-15s%-15s%-15s%-15s\n", "Name","Website","Mobile","Founder","Number of Dept","Location","Starting Date");
		Iterator<College> it = collegeList.iterator();
		while(it.hasNext())
		{
			College c = it.next();
			System.out.format("%-15s%-20s%-15s%-15s%-15s%-15s%-15s\n", c.getName(),c.getWebsite(),c.getMobile(),c.getFounder(),c.getNumberOfDept(),c.getLocation(),sdf.format(c.getStartingDate()));
		}
	}

	
}

import java.util.Date;

public class Employee implements Comparable<Employee>{
	private Integer id;
	private String name;
	private Date dateOfJoining;
	
	public Employee() {}

	public Employee(Integer id, String name, Date dateOfJoining) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfJoining = dateOfJoining;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dateOfJoining=" + dateOfJoining + "]";
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Employee arg=(Employee) obj;
		return this.getId().equals(arg.getId());
	}

	@Override
	public int compareTo(Employee arg0) {
		return this.getName().compareTo(arg0.getName());
//		return this.getId().compareTo(arg0.getId());
	}
	
	
}

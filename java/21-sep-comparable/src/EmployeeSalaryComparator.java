import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee arg0, Employee arg1) {
//		return (int) (arg0.getSalary()-arg1.getSalary());
		return arg0.getSalary().compareTo(arg1.getSalary());
	}
	

}

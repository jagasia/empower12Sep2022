import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Set;
import java.util.TreeSet;

public class App3TreeSet {

	public static void main(String[] args) throws ParseException {
		Set<Employee> empSet=new TreeSet<Employee>();
		//dd-MMM-yyyy
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		empSet.add(new Employee(15, "Raja", sdf.parse("17-Aug-2022")));
		empSet.add(new Employee(70, "Abdul", sdf.parse("27-Feb-2022")));
		empSet.add(new Employee(10, "Raja", sdf.parse("02-Sep-2022")));
		empSet.add(new Employee(85, "Zaheer", sdf.parse("17-Oct-2022")));
		empSet.add(new Employee(100, "Babu", sdf.parse("01-Mar-2022")));
		empSet.add(new Employee(75, "Anirudh", sdf.parse("17-Jan-2022")));
		empSet.add(new Employee(10, "Anirudh", sdf.parse("02-Sep-2022")));
		
		for(Employee e:empSet)
		{
			System.out.println(e);
		}
	}

}

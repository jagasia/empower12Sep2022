import java.util.ArrayList;
import java.util.Collections;

public class App_Comp {

	public static void main(String[] args) {
		ArrayList<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(5, "Raja", 122221.0, "ECE"));
		empList.add(new Employee(15, "Abdul", 88888.0, "EEE"));
		empList.add(new Employee(51, "Zaheer", 99999.0, "ECE"));
		empList.add(new Employee(25, "Babu", 22222.0, "ECE"));
		empList.add(new Employee(53, "Ganesh", 44444.0, "EEE"));
		empList.add(new Employee(52, "Charles", 888822.0, "ECE"));
		empList.add(new Employee(35, "Hari", 98765.0, "EEE"));
		
		Collections.sort(empList, (x,y)->y.getName().compareTo(x.getName()));
		
		for(Employee e:empList)
			System.out.println(e);
	}

}

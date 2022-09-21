import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		TreeSet<Employee> empSet=new TreeSet<Employee>(new EmployeeSalaryComparator());
		empSet.add(new Employee(5, "Raja", 122221.0, "ECE"));
		empSet.add(new Employee(15, "Abdul", 88888.0, "EEE"));
		empSet.add(new Employee(51, "Zaheer", 99999.0, "ECE"));
		empSet.add(new Employee(25, "Babu", 22222.0, "ECE"));
		empSet.add(new Employee(53, "Ganesh", 44444.0, "EEE"));
		empSet.add(new Employee(52, "Charles", 888822.0, "ECE"));
		empSet.add(new Employee(35, "Hari", 98765.0, "EEE"));
		
		for(Employee e:empSet)
			System.out.println(e);
	}

}

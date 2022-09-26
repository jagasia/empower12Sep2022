import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App2 {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(25, "Anirudh", 1934456.0, "ECE"));
		empList.add(new Employee(15, "Yashwanth", 100000.0, "CSE"));
		empList.add(new Employee(27, "Shashank", 192837.0, "ISE"));
		empList.add(new Employee(10, "Sourabh", 987654.0, "ECE"));
		empList.add(new Employee(125, "Praveen", 878787.0, "TCE"));
		empList.add(new Employee(78, "Naman", 373737.0, "ECE"));
		empList.add(new Employee(77, "Deeraj", 1298768.0, "ECE"));
		empList.add(new Employee(66, "Riya", 1234586.0, "ECE"));
		empList.add(new Employee(88, "Yuvalakshmi", 100000.0, "CSE"));
		empList.add(new Employee(90, "Bahushruth", 1283456.0, "EEE"));
		empList.add(new Employee(99, "Nachiketh", 1823456.0, "EEE"));
		
		
//		empList.stream()
//		.map((e)->e.getName())
//		.forEach(System.out::println);
		
		
//		List<Employee> result = empList.stream()
//		.filter((e)->e.getDepartment().equals("ECE"))
//		.sorted((x,y)->x.getName().compareTo(y.getName()))
//		.collect(Collectors.toList());
//		
//		for(Employee e:result)
//		{
//			System.out.println(e.getName());
//		}
		
		Map<String, Double> result = empList.stream()
//		.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//		.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summingDouble(Employee::getSalary)));
		.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
		
		for(Entry<String, Double> e:result.entrySet())
			System.out.println(e);
	}

}

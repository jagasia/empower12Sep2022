import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		System.out.println("How many employees?");
		int noOfEmployees=sc.nextInt();
		List<Employee> employeeList=new ArrayList<>();
		for(int i=0;i<noOfEmployees;i++)
		{
			String detail=sc.nextLine();
			if(detail.equals(""))
				detail=sc.nextLine();
			//split the detail into Employee
			String[] arr = detail.split(",");
			Employee employee=new Employee(Integer.valueOf(arr[0]),arr[1],Integer.valueOf(arr[2]),arr[3]);
			employeeList.add(employee);
		}
		
		//find the sum of salary departmentwise
		Map<String, Integer> result=new TreeMap<>();
		for(Employee e:employeeList)
		{
			String department=e.getDepartment();
			Integer sum=result.get(department);
			if(sum==null)
				sum=0;
			sum+=e.getSalary();
			result.put(department, sum);
		}
		
		for(Entry<String, Integer> e:result.entrySet())
			System.out.println(e.getKey()+" : "+e.getValue());
		
	}

}

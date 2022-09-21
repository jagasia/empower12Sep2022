import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		Set<Employee> empSet=new HashSet<Employee>();
		int choice=0;
		Integer id;
		String name;
		Double salary;
		String department;

		do
		{
			System.out.println("	1) add Employee details\r\n" + 
					"	2) Update Employee details\r\n" + 
					"	3) Remove an Employee\r\n" + 
					"	4) Display All employees details\r\n" + 
					"	5) Find an employee by Id\r\n" + 
					"	6) Find an employee by Department\r\n" + 
					"	7) Exit\r\n" + 
					"");
			choice=sc.nextInt();
			Employee e=null;
			boolean isFound=false;
			switch(choice)
			{
			case 1:
				System.out.println("Enter the details for adding a new employee:");
				System.out.println("Id:");
				id=sc.nextInt();
				System.out.println("Name:");
				name=sc1.nextLine();				
				System.out.println("Salary:");
				salary=sc.nextDouble();
				System.out.println("Department");
				department=sc1.nextLine();
				e=new Employee(id, name, salary, department);
				empSet.add(e);
				break;
			case 2:
				System.out.println("Enter the Id of the employee you want to update:");
				id=sc.nextInt();
				//check if id is found in the empSet or not
				for(Employee emp:empSet)
				{
					if(emp.getId().equals(id)) {
						//found
						e=emp;
						break;
					}
				}
				if(e==null)
					System.out.println("No employee found for the id:"+id);
				else
				{
					//update the values:
					System.out.println("Name:");
					name=sc1.nextLine();				
					System.out.println("Salary:");
					salary=sc.nextDouble();
					System.out.println("Department");
					department=sc1.nextLine();
					e.setName(name);
					e.setSalary(salary);
					e.setDepartment(department);
					System.out.println("Updated");
				}
				break;
			case 3:	//remove
				System.out.println("Enter the Id of the employee you want to update:");
				id=sc.nextInt();
				//check if id is found in the empSet or not
				
				for(Employee emp:empSet)
				{
					if(emp.getId().equals(id)) {
						//found
						e=emp;
						break;
					}
				}
				if(e==null)
					System.out.println("No employee found for the id:"+id);
				else
				{
					empSet.remove(e);
					System.out.println("Removed.");
				}
				break;
			case 4:
				if(empSet.size()>0)
				{
					System.out.println("Displaying all employees:");
					for(Employee emp:empSet)
						System.out.println(emp);
				}else
				{
					System.out.println("No employees present.");
				}
				break;
			case 5:	//FIND BY ID
				System.out.println("Enter the id of employee to find:");
				id=sc.nextInt();
				for(Employee emp:empSet)
				{
					if(emp.getId().equals(id)) {
						//found
						e=emp;
						break;
					}
				}
				if(e==null)
					System.out.println("No employee found for the id:"+id);
				else
				{
					System.out.println("Found employee:");
					System.out.println(e);
				}
				
				break;
			case 6:
				List<Employee> empList=new ArrayList<Employee>();
				System.out.println("Enter the department:");
				department=sc1.nextLine();
				for(Employee emp:empSet)
				{
					if(emp.getDepartment().equals(department))
					{
						empList.add(emp);						
					}
				}
				if(empList.size()==0)
				{
					System.out.println("No employees found in the department");
				}
				else
				{
					System.out.println("Displaying the employees of department:"+department);
					for(Employee emp:empList)
						System.out.println(emp);
				}
				break;
				
			}
		}while(true);
	}

}

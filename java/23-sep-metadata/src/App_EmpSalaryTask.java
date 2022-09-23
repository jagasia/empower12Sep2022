import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.OracleDriver;

public class App_EmpSalaryTask {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the department name:");
		String departmentName=sc.nextLine();
		departmentName=departmentName.toLowerCase();
		Driver driver=new oracle.jdbc.OracleDriver();
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
		PreparedStatement st = con.prepareStatement("SELECT count(*), sum(salary), avg(salary), max(salary) FROM EMPLOYEES GROUP BY department_id HAVING department_id IN(SELECT department_id FROM DEPARTMENTS WHERE LOWER(department_name)=?)");
		st.setString(1, departmentName);
		ResultSet rs = st.executeQuery();
		while(rs.next())
		{
			System.out.printf("Number of Employee:%d\nSum Of their salary:%d\nAvg salary:%.2f\nHighest Salary:%d\n",rs.getInt(1),rs.getInt(2),rs.getFloat(3),rs.getInt(4));
		}
		con.close();
	}

}

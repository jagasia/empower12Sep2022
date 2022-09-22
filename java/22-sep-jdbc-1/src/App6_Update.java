import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class App6_Update {

	public static void main(String[] args) throws SQLException {
		//program to add a row into Departments table
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		Integer departmentId=sc.nextInt();
		String departmentName=sc1.nextLine();
		Integer managerId=sc.nextInt();
		Integer locationId=sc.nextInt();
		
		Driver driver=new oracle.jdbc.OracleDriver();
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
//		UPDATE Departments SET department_name=?, manager_id=?, location_id=? WHERE department_id=?
		PreparedStatement st = con.prepareStatement("UPDATE Departments SET department_name=?, manager_id=?, location_id=? WHERE department_id=?");
		
		st.setString(1, departmentName);
		st.setInt(2, managerId);
		st.setInt(3, locationId);
		st.setInt(4, departmentId);
		
		int no=st.executeUpdate();			//for insert, update, delete, use executeUpdate
		con.close();
		System.out.println(no+" row(s) updated");
	}

}

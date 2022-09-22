import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class App5 {

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
		PreparedStatement st = con.prepareStatement("INSERT INTO DEPARTMENTS VALUES(?,?,?,?)");
		st.setInt(1, departmentId);
		st.setString(2, departmentName);
		st.setInt(3, managerId);
		st.setInt(4, locationId);
		
		int no=st.executeUpdate();			//for insert, update, delete, use executeUpdate
		con.close();
		System.out.println(no+" row(s) inserted");
	}

}

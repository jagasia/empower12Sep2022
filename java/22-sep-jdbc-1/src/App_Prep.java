import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class App_Prep {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.print("Employee id:");
		int eid=sc.nextInt();
		Driver driver = new oracle.jdbc.driver.OracleDriver();
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
		PreparedStatement st=con.prepareStatement("SELECT * FROM Employees WHERE employee_id=?");
		st.setInt(1,eid);
		ResultSet rs=st.executeQuery();
		if(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
		}else
		{
			System.out.println("No employee found for id:"+eid);
		}
		con.close();
	}

}

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws SQLException {
		int eid=new Scanner(System.in).nextInt();
		Driver driver = new oracle.jdbc.driver.OracleDriver();
//		DriverManager.registerDriver(driver);
//		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@<<host>>:<<port>>:
//		<<servicename>>","<<username>>","<<password");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM Employees WHERE employee_id="+eid);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
		}
		con.close();
//		DriverManager.deregisterDriver(driver);
		System.out.println("Success");
	}

}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {

	public static void main(String[] args) throws SQLException {
		new oracle.jdbc.driver.OracleDriver();
//		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@<<host>>:<<port>>:
//		<<servicename>>","<<username>>","<<password");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
		System.out.println("Success");
	}

}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class App3 {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the username:");
		String username=sc.nextLine();
		System.out.println("Enter the password:");
		String password=sc.nextLine();
		new oracle.jdbc.OracleDriver();
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM USER_MASTER WHERE username='"+username+"' and password='"+password+"'");
		if(rs.next())
			System.out.println("Login is successful");
		else
			System.out.println("Login failed");
		con.close();
	}

}


//
//CREATE TABLE USER_MASTER
//(
//USERNAME VARCHAR2(30) PRIMARY KEY,
//PASSWORD VARCHAR2(30) NOT NULL,
//FIRST_NAME VARCHAR2(30),
//LAST_NAME VARCHAR2(30)
//);

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class App4 {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the username:");
		String username=sc.nextLine();
		System.out.println("Enter the password:");
		String password=sc.nextLine();
		new oracle.jdbc.OracleDriver();
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
//		Statement st = con.createStatement();
		PreparedStatement st = con.prepareStatement("SELECT * FROM USER_MASTER WHERE username=? AND password=?");
		st.setString(1, username);
		st.setString(2, password);
		ResultSet rs = st.executeQuery();
		if(rs.next())
			System.out.println("Login is successful");
		else
			System.out.println("Login failed");
		con.close();
	}

}


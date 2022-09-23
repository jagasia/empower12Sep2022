import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class App_StoredProc2 {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no:");
		int no1=sc.nextInt();
		Driver driver=new oracle.jdbc.OracleDriver();
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
		CallableStatement st = con.prepareCall("{call prc2(?,?,?) }");
		st.setInt(1, no1);
		int sqr=0, cube=0;
		st.registerOutParameter(2,java.sql.Types.INTEGER);
		st.registerOutParameter(3, java.sql.Types.INTEGER);
		
		st.execute();
		sqr=st.getInt(2);
		cube=st.getInt(3);
		System.out.println("Square of "+no1+" is "+sqr);
		System.out.println("Cube of "+no1+" is "+cube);
		System.out.println("Done");
		con.close();
	}

}

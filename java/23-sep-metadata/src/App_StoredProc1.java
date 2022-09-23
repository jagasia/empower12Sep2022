import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.OracleDriver;

public class App_StoredProc1 {

	public static void main(String[] args) throws SQLException {
		Driver driver=new oracle.jdbc.OracleDriver();
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
		CallableStatement st = con.prepareCall("{call prcjag1() }");
		boolean status = st.execute();
		System.out.println("Done");
		con.close();
	}
	

}

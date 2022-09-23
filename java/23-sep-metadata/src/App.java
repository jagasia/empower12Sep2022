import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

public class App {

	public static void main(String[] args) throws SQLException {
		Driver driver=new oracle.jdbc.OracleDriver();
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM DEPT");
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnCount = rsmd.getColumnCount();
		for(int i=1;i<=columnCount;i++)
		{			
			System.out.print(rsmd.getColumnName(i)+"\t");
		}
		System.out.println();
		while(rs.next())
		{
			for(int i=1;i<=columnCount;i++)
			{			
				System.out.print(rs.getString(i)+"\t");
			}
			System.out.println();
		}
	}

}

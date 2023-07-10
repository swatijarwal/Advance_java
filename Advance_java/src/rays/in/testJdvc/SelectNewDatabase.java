package rays.in.testJdvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class SelectNewDatabase {
	
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava", "root", "rood");
		Statement stmt = conn.createStatement();
		ResultSet rs   =              stmt.executeQuery("select * from stu where fees = max(fees)from stu");
		
		  System.out.println("id \t name \t address");
		 while(rs.next())
		 {
			 System.out.print(rs.getInt(1));
			 System.out.print("\t" + rs.getString(2));
			 System.out.println("\t" + rs.getString(3));
			 System.out.println("\t" + rs.getInt(4));
			 
		 }
		
	}
}

package rays.in.testJdvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchInsertData {
	public static void main(String[] args) throws Exception {
		
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	  Connection conn=   DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava", "root", "rood");
	Statement stmt =   conn.createStatement();
	       int i=   stmt.executeUpdate("insert into batch values(1,'swati')");
	     
  System.out.println("data inserted1" + i);

	}	

}

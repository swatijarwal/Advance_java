package rays.in.testJdvc;
import java.sql.*;
public class TestUpdate {

	public static void main(String[] args) throws Exception {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root", "rood");
		   Statement stmt= conn.createStatement();
		int i=    stmt.executeUpdate("update markseet set name='mridu' where id= 1");
		    System.out.println( "update record" + i);

	}

}

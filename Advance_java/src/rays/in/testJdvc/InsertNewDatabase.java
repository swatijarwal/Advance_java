package rays.in.testJdvc;
import java.sql.*;
public class InsertNewDatabase {
	
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		  Connection conn=   DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava", "root", "rood");
		Statement stmt =   conn.createStatement();
		       int i=   stmt.executeUpdate("insert into stu values(11,'raksha') ");
		     
        System.out.println("data inserted1" + i);
	}


}

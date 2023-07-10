package rays.in.testJdvc;
import java.sql.*;
public class TestInsert {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		  Connection conn=   DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root", "rood");
		Statement stmt =   conn.createStatement();
		       int i=   stmt.executeUpdate("insert into markseet values(11,'raksha',111,78,87,87) ");
		     
        System.out.println("data inserted1" + i);
	}

}

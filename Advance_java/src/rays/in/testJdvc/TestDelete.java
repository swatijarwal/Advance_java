package rays.in.testJdvc;
import java.sql.*;
public class TestDelete {

	public static void main(String[] args) throws Exception {
		  Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn=	   DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root", "rood"); 
		Statement stmt=    conn.createStatement();
		 int i= stmt.executeUpdate("delete from markseet where id=11");
		   
		   System.out.println("delete record"+ i);

	}

}

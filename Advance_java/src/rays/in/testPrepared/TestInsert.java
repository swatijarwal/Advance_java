package rays.in.testPrepared;
import java.sql.*;
public class TestInsert {
	
	public static void main(String[] args) throws Exception {
		TestInsert();
		
		
	}
	

		

	public static void TestInsert() throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		  Connection conn=   DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root", "rood");
		   PreparedStatement ps=  conn.prepareStatement("insert into Markseet values(11,'shubhi',111,69,87,78)");
		    int i= ps.executeUpdate();
		       System.out.println("data insert"+ i);
	}
		
	}



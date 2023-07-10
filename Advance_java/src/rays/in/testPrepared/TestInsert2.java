package rays.in.testPrepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestInsert2 {
	
	public static void main(String[] args) throws Exception {
		TestSecondTerm(14,"anita",114,67,78,87);
		
	}
	
	
	public static void TestSecondTerm(int id,String name,int roll_no,int physics,int chemistry,int maths) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		  Connection conn=   DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root", "rood");
		   PreparedStatement ps=  conn.prepareStatement("insert into markseet values(?,?,?,?,?,?)");
		   
		   
		    ps.setInt(1, id);
		    ps.setString(2, name);
		    ps.setInt(3, roll_no);
		    ps.setInt(4, physics);
		    ps.setInt(5, chemistry);
		    ps.setInt(6, maths);
		   
		   int i= ps.executeUpdate();
		   System.out.println(i);
		    
		    
	}
	

}

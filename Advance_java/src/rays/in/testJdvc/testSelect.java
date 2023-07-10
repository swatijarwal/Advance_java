package rays.in.testJdvc;

import java.sql.*;

import com.mysql.cj.protocol.Resultset;



public class testSelect {

	public static void main(String[] args) throws Exception  {
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root", "rood");
		    Statement stmt=  conn.createStatement();
		      ResultSet rs   =              stmt.executeQuery("select* from markseet");
		      
		      
		      while(rs.next())
		      {
		    	  System.out.print(   rs.getInt(1));
		    	  System.out.print( "\t"+ rs.getString(2));
		    	  System.out.print(  "\t"+ rs.getInt(3));
		    	  System.out.print(  "\t"+ rs.getInt(4));
		    	  System.out.print(  "\t"+ rs.getInt(5));
		    	  System.out.println( "\t"+  rs.getInt(6));
		    	  
		      }

	}

}

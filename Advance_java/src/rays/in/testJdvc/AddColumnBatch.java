package rays.in.testJdvc;

import java.sql.*;

import com.mysql.cj.protocol.Resultset;


public class AddColumnBatch {
	
	
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		  Connection conn=   DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava", "root", "rood");
		Statement stmt =   conn.createStatement();
		       ResultSet rs = stmt.executeQuery("select * from batch order by salary desc");
		       while(rs.next())
		       {
		    	   System.out.print(rs.getInt(1));
		    	   System.out.print( "\t" + rs.getString(2));
		    	   System.out.println( "\t" + rs.getInt(3));
		    	   
		    	   
		       }
		       
		       
	}	     
       


}

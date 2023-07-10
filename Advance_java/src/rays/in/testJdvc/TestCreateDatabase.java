package rays.in.testJdvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestCreateDatabase {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "rood");
	    Statement stmt=  conn.createStatement();
	    
	    int i=  stmt.executeUpdate("create database advancejava");
	      System.out.println("create database" + i);
	    

	}

}

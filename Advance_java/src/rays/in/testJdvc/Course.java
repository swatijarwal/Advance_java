package rays.in.testJdvc;
import java.sql.*;
import java.sql.DriverManager;

public class Course {
	
	public static void main(String[] args) throws Exception {
		 Class.forName("com.mysql.cj.jdbc.Driver");
     Connection conn=    DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava", "root", "rood");
       Statement stmt=  conn.createStatement();
      int i = stmt.executeUpdate("alter table stu add Foriegn key(course_id) references course(id)");
      System.out.println(i);
         
         
	}

}

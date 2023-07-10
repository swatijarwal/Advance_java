package rays.in.testJdvc;

import java.sql.*;

public class UpdateTableNewDatabase {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava", "root", "rood");
		Statement stmt = conn.createStatement();
		int i = stmt.executeUpdate("alter table stu add address varchar(20)");
		i = stmt.executeUpdate("update stu set address = 'indore'");
		System.out.println("update table" + i);

	}
}
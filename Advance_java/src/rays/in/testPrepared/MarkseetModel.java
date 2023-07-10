package rays.in.testPrepared;
import java.sql.*;
public class MarkseetModel {
	
	

	
	public static void Testadd(MarkseetBean bean) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		  Connection conn=   DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root", "rood");
		   PreparedStatement ps=  conn.prepareStatement("insert into markseet values(?,?,?,?,?,?)");
		   
		     ps.setInt(1,bean.getId() );
		     ps.setString(2, bean.getName());
		     ps.setInt(3, bean.getRoll_no());
		     ps.setInt(4, bean.getPhysics());
		     ps.setInt(5, bean.getChemistry());
		     ps.setInt(6, bean.getMaths());
		
		  int i=   ps.executeUpdate();
		    System.out.println(i);
	
		    
	
	}		
       
	public static void Testupdate(MarkseetBean bean) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		  Connection conn=   DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root", "rood");
		   PreparedStatement ps=  conn.prepareStatement("update markseet set name=?,roll_no=?,physics=?,chemistry=?,maths=? where id=?");
		//int i=   ps.executeUpdate();
		   // ps.setInt(1, bean.getId());
		    ps.setString(1, bean.getName());
		    ps.setInt(2, bean.getRoll_no());
		    ps.setInt(3, bean.getPhysics());
		    ps.setInt(4, bean.getChemistry());
		    ps.setInt(5, bean.getMaths());
		    ps.setInt(6, bean.getId());
		    int i=   ps.executeUpdate();
		    System.out.println(i);
		   
		   
	}
	public static void Testdelete(int id) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		  Connection conn=   DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root", "rood");
		   PreparedStatement ps=  conn.prepareStatement("delete from markseet where id=? ");
		   ps.setInt(1, id);
		    int i= ps.executeUpdate();
		    System.out.println(i);
	}	
}

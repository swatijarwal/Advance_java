package rays.in.testPrepared;
import java.sql.*;
public class TestModel {
	public static void main(String[] args) throws Exception {
		
		//Testadd();
		//Testupdate();
		Testdelete();
		
	}

	private static void Testdelete() throws Exception {
		MarkseetModel model = new MarkseetModel();
		model.Testdelete(1);
		
	}

	private static void Testupdate() throws Exception {
		MarkseetBean bean= new MarkseetBean();
		 bean.setId(11);
		 bean.setName("nicky");
		 bean.setRoll_no(211);
		 bean.setPhysics(68);
		 bean.setChemistry(70);
		 bean.setMaths(80);
		  MarkseetModel model= new MarkseetModel();
		  model.Testupdate(bean);
		
		
	}

	private static void Testadd() throws Exception {
		MarkseetBean bean = new MarkseetBean();
		 bean.setId(15);
		 bean.setName("pradeep");
		 bean.setRoll_no(115);
		 bean.setPhysics(78);
		bean.setChemistry(80);
		bean.setMaths(99);
		MarkseetModel model= new MarkseetModel();
		model.Testadd(bean);
		
	}

}

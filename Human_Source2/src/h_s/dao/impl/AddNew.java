package h_s.dao.impl;
import java.io.IOException;
import h_s.bean.Employee;
public class AddNew {
	public static void main(String args[]) throws IOException{
		Employee user = new Employee();
		user.setEmployeeName("zww");
		user.setPassword("123456");
		UserDAOImpl s = new UserDAOImpl();
		s.register(user);
	}
	
}

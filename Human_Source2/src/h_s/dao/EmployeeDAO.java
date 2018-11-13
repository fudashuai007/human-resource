package h_s.dao;

import java.util.List;

import h_s.bean.Employee;

public interface EmployeeDAO {
	public void register(Employee e);
	public boolean login(String Employee_name,String password);
	public void update(Employee e);
	public void delete(int id);
	public Employee search(String name);     //通过员工姓名查找员工
	public List<Employee> search_Prj(String Prj_name);    //查找含有项目经历的人
}

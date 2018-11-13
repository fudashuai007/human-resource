package h_s.dao;

import java.util.List;

import h_s.bean.Employee;

public interface EmployeeDAO {
	public void register(Employee e);
	public boolean login(String Employee_name,String password);
	public void update(Employee e);
	public void delete(int id);
	public Employee search(String name);     //ͨ��Ա����������Ա��
	public List<Employee> search_Prj(String Prj_name);    //���Һ�����Ŀ��������
}

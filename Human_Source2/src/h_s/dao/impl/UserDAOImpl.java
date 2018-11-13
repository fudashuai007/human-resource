package h_s.dao.impl;

import java.util.List;

import h_s.bean.Employee;
import h_s.dao.EmployeeDAO;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class UserDAOImpl implements EmployeeDAO{
	public void register(Employee e){    //新的员工第一次填写简历
		Session session = new HibernateUtil().getSession();
		Transaction tran = session.getTransaction();
		tran.begin();
		try{
			session.save(e);
			tran.commit();
		}catch(HibernateException a){
			a.printStackTrace();
			tran.rollback();
		}finally{
			session.close();
		}
	}
	public void update(Employee e){
		Session session = new HibernateUtil().getSession();
		Transaction tran = session.beginTransaction();
		try{
			session.update(e);
			tran.commit();
		}catch(HibernateException a){
			a.printStackTrace();
			tran.rollback();
		}finally{
			session.close();
		}
	}
	public void delete(int id){
		Session session = new HibernateUtil().getSession();
		Transaction tran = session.beginTransaction();
		try{
			Query q = session.createQuery("delete from Employee where id = ?");
			q.setParameter(0, id);
			q.executeUpdate();
			tran.commit();
		}catch(HibernateException e){
			e.printStackTrace();
			tran.rollback();
		}finally{
			session.close();
		}
	}
	public Employee search(String name) {    //按姓名搜索员工
		Session session = new HibernateUtil().getSession();
		try{
			return (Employee)session.get(Employee.class, new String(name));
		}catch(HibernateException e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		return new Employee();
	}
	public Employee search(int id){
		Session session =new HibernateUtil().getSession();
		try{
			return (Employee)session.get(Employee.class, id);
		}catch(HibernateException e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		return new Employee();
	}
	public List<Employee> search_Prj(String Prj_name) {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean login(String Employee_name, String password) {
		Session session = new HibernateUtil().getSession();
		try{
			Query q = session.createQuery("select * from Employee where name = ? and password= ?");
			q.setParameter(0, Employee_name);
			q.setParameter(1,password);
			List<Object> list = q.list();
			if(list==null)
				return false;
			if(list!=null)
				return true;
			//tran.commit();
		}catch(HibernateException e){
			e.printStackTrace();
		}
		return false;
		
	}
}

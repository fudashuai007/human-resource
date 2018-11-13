package h_s.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	public Session getSession(){
		Configuration cof = new Configuration();    //读取默认的Employee.hbm.xml文件
		cof.configure();
		@SuppressWarnings("deprecation")
		SessionFactory sf = cof.buildSessionFactory();   //管理Session
		Session session = sf.openSession();
		return session;
	}
}

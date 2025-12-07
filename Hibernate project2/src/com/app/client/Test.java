package com.app.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.app.config.HibernateUtil;
import com.app.model.Employee;

public class Test {	
		public static void main(String[] args) {
			Employee e = new Employee();
			
			e.setId(7);
			e.setName("pratiksha");
			e.setAddress("pune");
			
			Employee e1= new Employee();
			e1.setId(8);
			e1.setAddress("pune");
			e1.setName("pqr");
		SessionFactory sf = 	HibernateUtil.getSessionFactory();
	Session ss =	sf.openSession();
//	ss.persist(e);
//	ss.persist(e1);
	 Employee emp=ss.get(Employee.class, 1);
	System.out.println(emp);
	ss.beginTransaction().commit();
	ss.close();
	
			
			
			
		}


}

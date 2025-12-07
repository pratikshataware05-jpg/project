package com.cjc.hb.app.client;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cjc.hb.app.config.HibernateUtil;
import com.cjc.hb.app.model.Student;


public class Test {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	Student st = new Student();
	
	System.out.println("enter values");
	st.setRollno(sc.nextInt());
	st.setName(sc.next());
	st.setMarks(sc.nextFloat());

SessionFactory sf= (SessionFactory) HibernateUtil.getSessionFactory();

	Session s= sf.openSession();
	s.persist(st);
	s.beginTransaction().commit();
	s.close();
	}
}

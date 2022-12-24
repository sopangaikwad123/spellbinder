package com.bikkadit.bank.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bikkadit.bank.model.Student;

public class App {
	
//	1st Step = Add hibernate configuration file
//	2nd Step = Create session factory
//	3rd Step = Create session
	
    @SuppressWarnings("deprecation")
	public static void main( String[] args )
    {
       Configuration cfg = new Configuration();
       cfg.configure("hibernate.cfg.xml");
       SessionFactory factory = cfg.buildSessionFactory();
       Session session = factory.openSession();
       
       
       Student st = new Student();
       st.setId(105);
       st.setName("Babloo");
       st.setDept("Electronic");
       st.setEmail("Babloo212@gmail.com");
       
       Transaction tx = session.beginTransaction();
       //session.save(st);
       session.persist(st);
       tx.commit();
       session.close();
       
    }
}

package com.bikkadit.bank.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bikkadit.bank.model.Fruit;
import com.bikkadit.bank.model.Student;

public class Retrival {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Configuration cfg = new Configuration();
	       cfg.configure("hibernate.cfg.xml");
	       
	       SessionFactory factory = cfg.buildSessionFactory();
	       Session session = factory.openSession();
	       
//	       Student student = session.get(Student.class, 105);//Not confirm
//	       session.load(Student.class, 105).getName().charAt(1);
	       
	       Fruit fruit = session.get(Fruit.class, 101);
	       System.out.println(fruit.getName());
	       System.out.println(fruit);
	       
//	       String email = student.getEmail();
	     //  System.out.println(name+" "+email);
	      
	       
	       session.close();
	       factory.close();
	       
	      

	}

}

package com.bikkadit.bank.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bikkadit.bank.model.Fruit;
import com.bikkadit.bank.model.Mango;

public class EmbedMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Configuration cfg = new Configuration();
	       cfg.configure("hibernate.cfg.xml");
	       SessionFactory factory = cfg.buildSessionFactory();
	       Session session = factory.openSession();
	       
	       
	       Fruit fr = new Fruit();
	       fr.setId(102);
	       fr.setName("Berry");
	       fr.setColour("Red");
	       fr.setRate(60);
	       
	       Mango mn = new Mango();
	       mn.setId(112);
	       mn.setPrize(800);
	       mn.setVariety("Kesar");
	       fr.setMango(mn);
	       
	       Transaction tx = session.beginTransaction();
	       session.save(fr);	       
	       tx.commit();
	       session.close();
	}

}

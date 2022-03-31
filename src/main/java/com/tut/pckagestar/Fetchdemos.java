package com.tut.pckagestar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

 
public class Fetchdemos {
	public static void main(String[] args) {
		
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session=sessionFactory.openSession();  
	       Student ad=(Student)session.load(Student.class,13);
	       System.out.println(ad);
	       session.close();
	       sessionFactory.close();
		
		
	}
	  

}

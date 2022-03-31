package com.tut.pckagestar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      SessionFactory sessionFactory =
	        	    new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	      
	      
	      Student student1=new Student();
	      
	      student1.setId(11233);
	      student1.setName("Nishant");
	      student1.setCity("Bihar");
	      
	      Certificate certificate=new Certificate();
	      certificate.setCourseString("Django");
	      certificate.setDurationString("4 Months");
	      student1.setCertificate(certificate);
	      
	      
	      Session session=sessionFactory.openSession();
	      Transaction tsTransaction=session.beginTransaction();
	      session.save(student1);
	        	      
	      tsTransaction.commit();
	      session.close();
	       
	      sessionFactory.close();
	      
	}

}

package com.mapi;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Mapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  SessionFactory sessionFactory =
	        	    new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
 	        
	        
	        //creating question
		  Question question=new Question();
		  question.setId(112);
		  question.setQuestion("What is Django");
		  
		  //creating Answer
		  Answer answer=new Answer();
		  answer.setAnswer("Java is Programming language");
		  
		  answer.setQuestion(question);
		  answer.setAnswerid(321);
		  question.setAnswer(answer);
		  
		    Session session=sessionFactory.openSession();
	        Transaction tsTransaction=session.beginTransaction();
	      //save
	        
	        Question newQuestion=(Question)session.get(Question.class,112);
	        System.out.println(newQuestion.getQuestion());
	        
	        session.save(question);
	        session.save(answer);
	        tsTransaction.commit();
	        session.close();
		    sessionFactory.close();
	     
	}

}

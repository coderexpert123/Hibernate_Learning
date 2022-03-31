package com.tut.pckagestar;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import javax.sound.midi.Soundbank;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

import javassist.compiler.SymbolTable;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
       // System.out.println( "Hello World!" );
        SessionFactory sessionFactory =
        	    new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        System.out.print(sessionFactory);
     
        
        //Student 
        Student student=new Student();
        student.setId(13);
        student.setName("Nishant singh ");
        student.setCity("patna_bia ghsaharsa_56");
        
        //Creating object of address
        
        Address ad=new Address();
        ad.setStrretString("Rakiya_sharsha");
        ad.setCityString("Bihar");
        ad.setIsopen(true);
        ad.setAddeddate(new Date());
        ad.setX(1234);
        //Reading the file images;
        
        FileInputStream fStream=new FileInputStream("src/main/java/mains.jpg");
        byte[] data=new byte[fStream.available()];
        fStream.read(data);
        ad.setImage(data);
        
       
        System.out.println(student); 
        
        
        Session session=sessionFactory.openSession();
        Transaction tsTransaction=session.beginTransaction();
        session.save(student);
        session.save(ad);
        tsTransaction.commit();
        session.close();
        
        System.out.println("Done..");
    }
}

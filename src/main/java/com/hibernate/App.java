package com.hibernate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws IOException
    {
        System.out.println("Project Started");
        
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        // creating student
      Student st=new Student();
        st.setId(334);
        st.setName("Shrawan");
        st.setCity("Pune");     
        System.out.println("st");
        
        //creating object of address class
        Address ad=new Address();
        ad.setStreet("street1");
        ad.setCity("Pune");
        ad.setIsopen(true);
        ad.setAddedDate(new Date());      
        ad.setX(1234.234);
        
        //Reading File
        FileInputStream fis=new FileInputStream("src/main/java/pohe.jpg");
        byte[] data=new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        
        
        
     Session session=factory.openSession();
    ///
     Transaction tx=session.beginTransaction();
     session.save(st);
     session.save(ad);
     tx.commit();
     session.close();
     System.out.println("Done...");
   //*/  
    }
     }

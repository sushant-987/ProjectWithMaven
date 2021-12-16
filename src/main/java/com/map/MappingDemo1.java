package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo1 {
	
	public static void main(String[] args) {
		
		 Configuration cfg=new Configuration();
	     cfg.configure("hibernate.cfg.xml");
	     SessionFactory factory=cfg.buildSessionFactory();
	
	     Emp e1=new Emp();
	     Emp e2=new Emp();
	     
	     e1.setEid(80);
	      e1.setEname("Ram");
	     
	     e2.setEid(20);
	     e2.setEname("Sham");
	     
	     Project p1=new Project();
	     Project p2=new Project();
	     p1.setPid(2336645);
	     p1.setProjectName("Google");
	     p2.setPid(8909678);
	     p2.setProjectName("Chrome");
	     
	     List<Emp>list1=new ArrayList<Emp>();
	     
	     list1.add(e1);
	     list1.add(e2);
	     p1.setEmps(list1);
	     p2.setEmps(list1);
	    Session s=factory.openSession();
	     Transaction tx=s.beginTransaction();
	     
	     s.save(e1);
	     s.save(e2);
	     s.flush();
	     tx.commit();
	     
	}

}

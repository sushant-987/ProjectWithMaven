package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Student student1 = new Student();
		student1.setId(1235);
		student1.setName("Shrawan");
		student1.setCity("Pune");

		Certificate certificate = new Certificate();
		certificate.setCourse("Java");
		certificate.setDuration("3 Months");
		student1.setCerti(certificate);

		Student student2 = new Student();
		student2.setId(999);
		student2.setName("Mukesh");
		student2.setCity("Mumbai");

		Certificate certificate1 = new Certificate();
		certificate1.setCourse("Hibernate");
		certificate1.setDuration("2 Months");
		student1.setCerti(certificate1);

		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();

		// Objects save:
		s.save(student1);
		s.save(student2);

		tx.commit();
		s.close();
		factory.close();

	}

}

package com.basic.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.basic.entity.Student;

public class TestHibernateFirstLevelCache {

	public static void main(String[] args) {
		
		Student std = new Student();
		std.setId(7);
		std.setRoll(2);
		std.setName("Rahul");
		std.setAddress("Kolhapur");
		
		Configuration conf = new Configuration();
		
		conf.configure();
		
		SessionFactory sf = conf.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction txn = session.beginTransaction();
		
//		session.save(std);
//		session.remove(std);
		
		txn.commit();
		
		Student std1 = session.get(Student.class, 5);
		System.out.println("Data fetched successfully 1 : "+std1);
		
		
		Student std2 = session.get(Student.class, 5);
		System.out.println("Data fetched successfully 2 --------------- : "+std2);
		
		System.out.println("Data saved to DB successfully..!!!");
		
		
		
		
		session.close();
		
	

	}

}

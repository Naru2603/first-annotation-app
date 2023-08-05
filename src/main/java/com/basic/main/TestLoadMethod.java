package com.basic.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.basic.entity.Employee;

public class TestLoadMethod {

	public static void main(String[] args) {
	
		Configuration conf = new Configuration();
		conf.configure();

		SessionFactory sf = conf.buildSessionFactory();

		Session session = sf.openSession();

		Transaction txn = session.beginTransaction();

		Employee emp = session.load(Employee.class, 2);

		txn.commit();
		
		System.out.println("Employee fetched successfully for Id 1 :"+emp);

		System.out.println("Employee data saved to DB successfully ");

		session.close();

	}

}

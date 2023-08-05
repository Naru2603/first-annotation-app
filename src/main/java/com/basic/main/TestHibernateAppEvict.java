package com.basic.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.basic.entity.Employee;

public class TestHibernateAppEvict {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setId(12);
		emp.setName("Raja");
		emp.setAddress("Jyotiba");
		emp.setDepartment("Design");

		Configuration conf = new Configuration();
		conf.configure();
		
		SessionFactory sf = conf.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction txn = session.beginTransaction();
		
		session.save(emp);
		
		txn.commit();
		session.evict(emp);
		
		emp.setName("Sanghram");
		session.close();
		
		System.out.println("Data saved to DB Successfully..!!");
	}

}

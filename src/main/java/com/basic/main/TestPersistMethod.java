package com.basic.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.basic.entity.Employee;

public class TestPersistMethod {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setEmpId(57);
		emp.setName("Rishi");
		emp.setAddress("Mumbai");
		emp.setDepartment("QA");
		
		Configuration conf = new Configuration();
		conf.configure();
		
		SessionFactory sf = conf.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction txn = session.beginTransaction();
		
		session.persist(emp);
		txn.commit();
		
		System.out.println("persist method returned from DB : ");
		
		System.out.println("Employee data saved to DB successfully ");
		
		session.close();
	}

}

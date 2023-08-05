package com.basic.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.basic.entity.EmployeeMerge;

public class TestHibernateAppMergeMethod {

	public static void main(String[] args) {
		
		EmployeeMerge emp = new EmployeeMerge();
		emp.setId(1);
		emp.setEmpId(10);
		emp.setName("Aniket");
		emp.setAddress("Hupari");
		emp.setDepartment("Transport");
		
		Configuration conf = new Configuration();
		conf.configure();
		
		SessionFactory sf = conf.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction txn = session.beginTransaction();
		
		session.save(emp);
		txn.commit();
		
		
		System.out.println("Data saved to DB successfully");
		session.close();
		
		emp.setName("Rishi");
		
		Session session2 = sf.openSession();
		EmployeeMerge emp2 = session2.get(EmployeeMerge.class, 1);
		Transaction txn2 = session2.beginTransaction();
		
		
		session2.merge(emp);
		txn2.commit();
		session2.close(); 
		

		

	}

}

package com.basic.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.basic.entity.Employee2;

public class TestHibernateAppUpdateMethod {

	public static void main(String[] args) {
		
		Employee2 emp = new Employee2();
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
		emp.setName("Rishi");
		session.update(emp);
		txn.commit();
		
		
		System.out.println("Data saved to DB successfully");
		session.close();
		
		
		

		
//		Session session2 = sf.openSession();
//		
//		Employee2 emp2 = session2.get(Employee2.class, 1);
//		
//		session2.update(emp);
//		
//		session2.close(); 

	}

}

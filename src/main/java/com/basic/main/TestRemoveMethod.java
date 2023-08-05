package com.basic.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.basic.entity.Employee;

public class TestRemoveMethod {

	public static void main(String[] args) {
	
		Employee emp = new Employee();
		emp.setId(22);
		emp.setEmpId(56);
		emp.setName("Bashya");
		emp.setAddress("Kabnur");
		emp.setDepartment("QA");
		
		Configuration conf = new Configuration();
		conf.configure();
		
		SessionFactory sf = conf.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction txn = session.beginTransaction();
		
		session.remove(emp);
		txn.commit();
		
		System.out.println("Data deleted from DB");
		System.out.println("Employee data saved to DB successfully ");
		
		session.close();

	}

}

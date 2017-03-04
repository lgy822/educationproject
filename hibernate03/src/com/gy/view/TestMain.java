package com.gy.view;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.gy.domain.Employee;
import com.gy.util.MySessionFactory;

public class TestMain {

	public static void main(String[] args) {
		//1.创建Configuration
		
		Session session=MySessionFactory.getSessionFactory().openSession();
		//selectEmployee(session);
		addEmployee( session);
	}

	private static void selectEmployee(Session session) {
		Employee emp=session.load(Employee.class, 1);
		System.out.println(emp.getEname()+"\t"+emp.getEid()+"\t"+emp.getEmail());
	}

	private static void addEmployee(Session session) {
		
		
		Transaction transaction=session.beginTransaction();
		
		Employee employee=new Employee();
		employee.setEname("张三");
		employee.setEmail("1354449188@qq.com");
		session.save(employee);
		transaction.commit();
		session.close();
	}

}

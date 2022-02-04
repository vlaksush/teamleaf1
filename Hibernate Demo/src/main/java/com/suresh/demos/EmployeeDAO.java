package com.suresh.demos;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class EmployeeDAO {
	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<Employee> getAllEmployee(){
		List<Employee> employeeList = new ArrayList();
	
		Session session =  HibernateUtil.getSessionFactory().openSession();
		employeeList = session.createCriteria(Employee.class).list();
		return employeeList;
	}
	
	
	public void addEmployee(Employee employee) {
		Session session =  HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(employee);
		transaction.commit();
		session.close();

	}
}

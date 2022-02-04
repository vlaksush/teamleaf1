package com.suresh.demos;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("dao.xml");
		
		IEmployeeDAO employeeDAO = ctx.getBean(EmployeeDAO.class);
		List<Employee> employeeList = employeeDAO.getEmployeeList();
		
//		Iterator<Employee> data = employeeList.iterator();
//		while(data.hasNext()) {
//			Employee emp = data.next();
//			System.out.println(emp);
//		}
		
		//lambda
//		employeeList.forEach(emp -> System.out.println(emp));
		employeeList.forEach(System.out::println);
		
	}

}

package com.suresh.demos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		IEmployeeDAO employeeDAO = ctx.getBean(EmployeeDAO.class);
		
		//select all
		List<Employee> employeeList = employeeDAO.getEmployeeList();
		employeeList.forEach(emp -> System.out.println(emp));
		
		System.out.println("-----------------------------------");
		
		//select by id
		Employee employee  = employeeDAO.findEmployeeById(102);
		System.out.println(employee);

		
//		//insert single record
//		Employee employee = new Employee(201,"Ramesh",7000);
//		employeeDAO.insertEmployee(employee);
		
//		//insert batch records(list of records)
//		Employee e1 = new Employee(301,"Ganesh",3000);
//		Employee e2 = new Employee(302,"Mahesh",4000);
//		Employee e3 = new Employee(303,"Yogesh",5000);
//		List<Employee> employeeList = new ArrayList();
//		employeeList.add(e1);
//		employeeList.add(e2);
//		employeeList.add(e3);
//		employeeDAO.insertBatchEmployee(employeeList);
		
//		//update 
//		int id = 101;
//		Employee employee = new Employee();
//		employee.setName("Sita");
//		employee.setSalary(2000);
//		employeeDAO.updateEmployee(id, employee);
		
//		//delete
//		int id=303;
//		employeeDAO.deleteEmployee(id);
		
		
	}

}

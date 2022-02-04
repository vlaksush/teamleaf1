package com.suresh.demos;

import java.util.List;

public class Demo1 {
	public static void main(String[] args) {
		EmployeeDAO employeeDAO = new EmployeeDAO();
		List<Employee> employeeList = employeeDAO.getAllEmployee();

		for (Employee emp : employeeList) {
			System.out.println(emp);
		}

		System.out.println("Adding new Employee");
		employeeDAO.addEmployee(new Employee(51,"Ganesh", 6000));

		employeeList = employeeDAO.getAllEmployee();

		for (Employee emp : employeeList) {
			System.out.println(emp);
		}

	}
}

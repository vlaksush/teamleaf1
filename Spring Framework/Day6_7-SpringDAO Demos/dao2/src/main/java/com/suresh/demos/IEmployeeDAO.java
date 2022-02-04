package com.suresh.demos;

import java.util.List;

public interface IEmployeeDAO {
	List<Employee> getEmployeeList();
	Employee findEmployeeById(int id);
	void insertEmployee(Employee employee);
	void insertBatchEmployee(List<Employee> employeeList);
	void updateEmployee(int id,Employee employee);
	void deleteEmployee(int id);
}

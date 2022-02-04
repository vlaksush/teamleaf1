package com.suresh.demos;

import java.util.List;

public interface IEmployeeDAO {
	public List<Employee> all();
	public Employee getEmployeeById(int id);
	public void saveEmployee(Employee employee);
	public void updateEmployee(Employee employee);
	public void deleteEmployee(int id);
}



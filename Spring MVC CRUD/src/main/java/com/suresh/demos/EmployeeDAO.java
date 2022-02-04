package com.suresh.demos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDAO implements IEmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> all() {
		String query = "select * from employee";
		List<Employee> employeeList = jdbcTemplate.query(query, new RowMapper() {
			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getInt("salary"));
				return emp;
			}
		});
		return employeeList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Employee getEmployeeById(int id) {
		String query = "select * from employee where id=?";
		Employee employee = (Employee) jdbcTemplate.queryForObject(query, new Object[] { id }, new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getInt(3));
				return emp;
			}
		});
		return employee;
	}


	public void saveEmployee(Employee employee) {
		String sql = "insert into Employee values(?,?,?)";
		jdbcTemplate.update(sql,
				new Object[] { employee.getId(),employee.getName(), employee.getSalary() });
	}

	public void updateEmployee(Employee employee) {
		String sql = "update employee set name=?,salary=? where id=?";
		jdbcTemplate.update(sql,
				new Object[] { employee.getName(), employee.getSalary(),employee.getId() });
	}
	
	public void deleteEmployee(int id) {
		String sql = "delete from employee where id=?";
		jdbcTemplate.update(sql,
				new Object[] { id });
	}
}

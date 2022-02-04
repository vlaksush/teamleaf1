package com.suresh.demos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDAO implements IEmployeeDAO {

	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@SuppressWarnings("unchecked")
	public List<Employee> getEmployeeList(){
		List<Employee> employeeList = new ArrayList<Employee>();
		String sql = "select * from employee";
		employeeList = jdbcTemplate.query(sql,new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee employee = new Employee();
				employee.setId(rs.getInt(1));
				employee.setName(rs.getString(2));
				employee.setSalary(rs.getInt(3));
				return employee;
			}
			
		});
		
		return employeeList;
	}
	
	



	
}


//class EmployeeMapper implements RowMapper<Employee>{
//
//	@Override
//	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
//		Employee employee = new Employee();
//		employee.setId(rs.getInt(1));
//		employee.setName(rs.getString(2));
//		employee.setSalary(rs.getInt(3));
//		return employee;
//	}
//	
//}

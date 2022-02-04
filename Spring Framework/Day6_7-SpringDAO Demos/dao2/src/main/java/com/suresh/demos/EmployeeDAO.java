package com.suresh.demos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class EmployeeDAO extends JdbcDaoSupport implements IEmployeeDAO {

	// select all
	@SuppressWarnings("unchecked")
	public List<Employee> getEmployeeList() {
		List<Employee> employeeList = new ArrayList<Employee>();
		String sql = "select * from employee";
		employeeList = getJdbcTemplate().query(sql, new RowMapper() {

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

	// find employee by id
	@Override
	public Employee findEmployeeById(int id) {
		Employee employee = new Employee();
		String sql = "select * from employee where id=?";
		Object input[] = new Object[] { id };
		employee = getJdbcTemplate().queryForObject(sql,input, new EmployeeMapper());
		return employee;
	}
	
	
	//insert single record
	@Override
	public void insertEmployee(Employee employee) {
		String sql = "insert into employee values(?,?,?)";
		Object input[] = new Object[] { employee.getId(),employee.getName(),employee.getSalary() };
		
		int count = getJdbcTemplate().update(sql,input);
		System.out.println(count +" record inserted " );
	}

	//insert batch(list of records)records
	@Override
	public void insertBatchEmployee(List<Employee> employeeList) {
		String sql = "insert into employee values(?,?,?)";
		getJdbcTemplate().batchUpdate(sql,new BatchPreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps, int rowNum) throws SQLException {
			Employee employee = employeeList.get(rowNum);
			ps.setInt(1,employee.getId());
			ps.setString(2, employee.getName());
			ps.setInt(3, employee.getSalary());
			}
			
			@Override
			public int getBatchSize() {
				return employeeList.size();
			}
		});
		
		System.out.println(employeeList.size()+" records are inserted");
	}

	//update an employee
	@Override
	public void updateEmployee(int id, Employee employee) {
		String sql = "update employee set name=?,salary=? where id=?";
		Object[] input = new Object[] {employee.getName(),employee.getSalary(),id};
		int count = getJdbcTemplate().update(sql,input);
		System.out.println(count+" record updated");
	}

	//delete an employee
	@Override
	public void deleteEmployee(int id) {
		String sql = "delete from employee where id = ?";
		Object[] input = new Object[] {id};
		int count = getJdbcTemplate().update(sql,input);
		System.out.println(count+" record deleted");
		
	}
	
	
	
}

class EmployeeMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setId(rs.getInt(1));
		employee.setName(rs.getString(2));
		employee.setSalary(rs.getInt(3));
		return employee;
	}

}

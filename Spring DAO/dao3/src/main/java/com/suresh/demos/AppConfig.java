package com.suresh.demos;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.suresh.demos")
public class AppConfig {

@Bean
public DataSource dataSource() {
	DriverManagerDataSource dataSource = new DriverManagerDataSource();
	dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	dataSource.setUrl("jdbc:mysql://localhost:3306/tl?useSSL=false");
	dataSource.setUsername("root");
	dataSource.setPassword("root");
	return dataSource;
}

//@Bean
//public EmployeeDAO employeeDAO() {
//	EmployeeDAO employeeDAO = new EmployeeDAO();
//	employeeDAO.setDataSource(dataSource());
//	return employeeDAO;
//}
	
}

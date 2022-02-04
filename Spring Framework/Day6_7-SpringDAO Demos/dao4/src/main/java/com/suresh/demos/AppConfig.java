package com.suresh.demos;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "com.suresh.demos")
public class AppConfig {

	@Bean
	public HikariDataSource dataSourceHikari() throws SQLException {
		HikariDataSource dataSource = new HikariDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setMaximumPoolSize(5);
		dataSource.setMaxLifetime(30000);
		dataSource.setIdleTimeout(30000);
		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/tl?useSSL=false");
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

package com.suresh.demos;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory = null;
	static {
		try {
			Configuration cfg = new Configuration();
			cfg.configure("myhibernate.cfg.xml").addAnnotatedClass(Employee.class);
			cfg.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/suresh?useSSL=false");
			cfg.setProperty("hibernate.connection.username", "root");
			cfg.setProperty("hibernate.connection.password", "root");
			sessionFactory = cfg.buildSessionFactory();
		} catch (Exception e) {
			System.out.println("Exception is :" + e.getMessage());
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}

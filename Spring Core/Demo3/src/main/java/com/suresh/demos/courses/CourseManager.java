package com.suresh.demos.courses;

import javax.annotation.*;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CourseManager implements InitializingBean,DisposableBean,ApplicationContextAware  {

	@Autowired
	@Qualifier("course1")
	private Course course;
	
	public void setCourse(Course course) {
		this.course = course;
	}
	
	public String displayCourseName() {
		return course.displayName();
	}
	public double displayCourseFees() {
		return course.displayFees();
	}

	
	@PostConstruct
	public void myinit() {
		System.out.println("Object created for PriceManager");
	}
	
	@PreDestroy
	public void mydestroy() {
		System.out.println("Closing resources");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Container Init");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Container Destroy");
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println(applicationContext);
		
	}
}

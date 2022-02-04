package com.suresh.demos.profiles;

import javax.annotation.*;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@PropertySource({"classpath:trainer/trainer.properties" ,"classpath:org.properties","classpath:course.properties","classpath:my.properties" })
public class CourseManager  {

	@Autowired//@Inject
	@Qualifier("course2")
	private Course course;
	
	
	@Autowired
	private Setup setup;
	
	
	public void setSetup(Setup setup) {
		this.setup = setup;
	}
	
	
	
	public void courseSetupData() {
		System.out.println(setup.setupData());
	}
	
	
	@Autowired
	Environment env;
	
	
	
	@Value("${trainer.name}")//setter injection by annotation
	private String trainerName;
	
	
	@Value("${orgName}")
	private String orgName;
	
	
	private String cid;
	private String duration;
	
	

	
	
	public CourseManager(@Value("${cid}")String cid,@Value("${duration}")String duration) {
		this.cid = cid;
		this.duration = duration;
	}
	
	
	public void setCourse(Course course) {
		this.course = course;
	}

	public void trainerDetails() {
		System.out.println("Org Name is "+orgName);
		System.out.println("Trainer Name is "+trainerName);
		System.out.println("Trainer Experience is "+env.getProperty("trainer.experience"));
	}

	public void courseDetails() {
		String courseName = course.displayName();
		double  courseFees = course.displayFees();
		System.out.println("Course Name is "+courseName);
		System.out.println("Course Fees is "+courseFees);
		System.out.println("Course Id is "+cid);
		System.out.println("Course Duration is "+duration);
	}
}

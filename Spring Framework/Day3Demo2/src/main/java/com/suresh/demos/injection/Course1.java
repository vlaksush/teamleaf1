package com.suresh.demos.injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Course1 implements Course {

	@Value("Java is standad language always")
	public String msg; 
	
	public String displayName() {
		
		return "Java FS";
	}

	public double displayFees() {
		
		return 2000.0;
	}

}

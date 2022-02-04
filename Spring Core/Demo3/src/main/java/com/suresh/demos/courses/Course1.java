package com.suresh.demos.courses;

import org.springframework.stereotype.Component;

@Component
public class Course1 implements Course {

	public String displayName() {
		
		return "Java FS";
	}

	public double displayFees() {
		
		return 2000.0;
	}

}

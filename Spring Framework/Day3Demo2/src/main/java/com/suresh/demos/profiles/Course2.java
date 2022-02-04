package com.suresh.demos.profiles;

import org.springframework.stereotype.Component;

@Component
public class Course2 implements Course {

	public String displayName() {
		
		return "Dotet FS";
	}

	public double displayFees() {
	
		return 1000.0;
	}
	
}

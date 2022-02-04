package com.suresh.demos.autowires;

public class Course1 implements Course {

	@Override
	public String displayName() {
		return "Java FS";
	}

	@Override
	public String displayFees() {
		return "2000.0";
	}

}

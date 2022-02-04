package com.suresh.demos.autowires;

public class CourseManager {

	private Course course;
	private Trainer trainer;
	
	public void setCourse(Course1 course) {
		this.course = course;
	}

	public void setTrainer(Trainer1 trainer) {
		this.trainer = trainer;
	}
	

	
//	public CourseManager(Course course,Trainer trainer) {
//		this.course = course;
//		this.trainer = trainer;
//	}
	
	public void displayCourseDetails() {
		String courseName = course.displayName();
		String courseFees = course.displayFees();
		
		String trainerName = trainer.displayName();
		String trainerExperience = trainer.displayExperience();
		
		
		System.out.println("Course Name : "+courseName);
		System.out.println("Course Fees : "+courseFees);
		System.out.println("Trainer Name : "+trainerName);
		System.out.println("Trainer Experience : "+trainerExperience);
		
	}
	
	
}

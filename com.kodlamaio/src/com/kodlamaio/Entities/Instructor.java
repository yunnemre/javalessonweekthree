package com.kodlamaio.Entities;

public class Instructor {

	private int Id;
	private String InstructorName;
	private Course course;
	
	public Instructor() {
		super();
	}


	public Instructor(int id, String instructorName, Course course) {
		super();
		Id = id;
		InstructorName = instructorName;
		this.course = course;
	}



	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getInstructorName() {
		return InstructorName;
	}

	public void setInstructorName(String instructorName) {
		InstructorName = instructorName;
	}


	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}
	
	
	
}

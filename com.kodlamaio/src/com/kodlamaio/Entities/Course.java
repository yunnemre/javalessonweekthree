package com.kodlamaio.Entities;

public class Course {

	private int Id;
	private String CourseName;
	private double CoursePrice;
	private Catagory catagory;

	public Course() {
		super();
	}

	public Course(int id, String courseName, double coursePrice,Catagory catagory) {
		super();
		Id = id;
		CourseName = courseName;
		CoursePrice = coursePrice;
		this.catagory=catagory;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public double getCoursePrice() {
		return CoursePrice;
	}

	public void setCoursePrice(double coursePrice) {
		CoursePrice = coursePrice;
	}

	public Catagory getCatagory() {
		return catagory;
	}

	public void setCatagory(Catagory catagory) {
		this.catagory = catagory;
	}

	
}

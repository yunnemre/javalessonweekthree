package com.kodlamaio;

import com.kodlamaio.Bussines.CatagoryManager;
import com.kodlamaio.Bussines.CourseManager;
import com.kodlamaio.Bussines.InstructorManager;
import com.kodlamaio.DataAccess.Catagory.JdbcCatagoryDao;
import com.kodlamaio.DataAccess.Course.HibernateCourseDao;
import com.kodlamaio.DataAccess.Course.ICourseDao;
import com.kodlamaio.DataAccess.Course.JdbcCourseDao;
import com.kodlamaio.DataAccess.Insructor.HibernateInstructorDao;
import com.kodlamaio.Entities.Catagory;
import com.kodlamaio.Entities.Course;
import com.kodlamaio.Entities.Instructor;
import com.kodlamaio.core.Logger.DatabaseLogger;
import com.kodlamaio.core.Logger.FileLogger;
import com.kodlamaio.core.Logger.ILogger;


public class Main {

	public static void main(String[] args) {
		
		Catagory catagory=new Catagory();
		catagory.setCatagoryName("Programlama");
		catagory.setId(2);
		
		Course course=new Course();
		course.setId(1);
		course.setCourseName("Java İleri Seviye");
		course.setCatagory(catagory);
		course.setCoursePrice(10);
		
		Instructor instructor=new Instructor();
		instructor.setId(3);
		instructor.setInstructorName("Yunus Emre");
		instructor.setCourse(course);
		
		
		
		System.out.println("------------------EXAMPLES-----------------------------");
		ILogger[] loggers= {new DatabaseLogger(),new FileLogger()};
		CourseManager courseManager= 
				new CourseManager(new JdbcCourseDao(), loggers);
		courseManager.Add(course);
		System.out.println("      ");
		courseManager.Update(course);
		System.out.println("      ");
		courseManager.Delete(course);
		
		System.out.println("------------------EXAMPLES-----------------------------");
		
		ILogger[] loggers2= {new DatabaseLogger()};
		InstructorManager instructorManager=
				new InstructorManager(new HibernateInstructorDao(), loggers2);
		instructorManager.Add(instructor);
		System.out.println("      ");
		instructorManager.Update(instructor);
		System.out.println("      ");
		instructorManager.Delete(instructor);
		
		System.out.println("------------------EXAMPLES-----------------------------");
		ILogger[] loggers3= {new DatabaseLogger(),new FileLogger()};
		CatagoryManager catagoryManager=
				new CatagoryManager(new JdbcCatagoryDao(), loggers3);
		catagoryManager.Add(catagory);
		System.out.println("      ");
		catagoryManager.Update(catagory);
		System.out.println("      ");
		catagoryManager.Delete(catagory);
		
		
		
	}

}

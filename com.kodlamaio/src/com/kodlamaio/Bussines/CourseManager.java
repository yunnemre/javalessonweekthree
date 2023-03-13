package com.kodlamaio.Bussines;

import com.kodlamaio.DataAccess.Course.ICourseDao;
import com.kodlamaio.Entities.Course;
import com.kodlamaio.core.Logger.ILogger;



public class CourseManager implements ICourseService{

	private ICourseDao courseDao;
	private ILogger[] loggers;
	

	public CourseManager(ICourseDao courseDao,ILogger[] loggers) {
		this.courseDao = courseDao;
		this.loggers=loggers;
	}

	@Override
	public void Add(Course course) {
		if (course.getCoursePrice()<=0)
		{
			System.out.println("Kurs bilgileri geçersiz");
		}
		courseDao.Add(course);
		
		for(ILogger logger : loggers) {
			logger.log(course.getCourseName());
		}
		
	}

	@Override
	public void Update(Course course) {
		courseDao.Update(course);
		
		for(ILogger logger : loggers) {
			logger.log(course.getCourseName());
		}
		
	}

	@Override
	public void Delete(Course course) {
		courseDao.Delete(course);
		
		for(ILogger logger : loggers) {
			logger.log(course.getCourseName());
		}
		
	}

	
	
}

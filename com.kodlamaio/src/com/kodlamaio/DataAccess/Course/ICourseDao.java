package com.kodlamaio.DataAccess.Course;

import com.kodlamaio.Entities.Course;

public interface ICourseDao {
	
	void Add(Course course);
	void Update(Course course);
	void Delete(Course course);
	
	
}

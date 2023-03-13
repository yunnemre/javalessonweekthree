package com.kodlamaio.DataAccess.Insructor;

import com.kodlamaio.Entities.Instructor;

public interface IInstructorDao {
	
	void Add(Instructor instractor);
	void Update(Instructor instractor);
	void Delete(Instructor instractor);
	
}

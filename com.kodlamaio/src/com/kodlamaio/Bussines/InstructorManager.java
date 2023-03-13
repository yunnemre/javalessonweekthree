package com.kodlamaio.Bussines;

import com.kodlamaio.DataAccess.Insructor.IInstructorDao;
import com.kodlamaio.Entities.Instructor;
import com.kodlamaio.core.Logger.ILogger;

public class InstructorManager implements IInstrucatorService {
	private IInstructorDao instractorDao;
	private ILogger[] loggers;
	

	public InstructorManager(IInstructorDao instractorDao,ILogger[] loggers) {
		this.instractorDao = instractorDao;
		this.loggers=loggers;
	}


	@Override
	public void Add(Instructor instructor) {
		instractorDao.Add(instructor);
		
		for(ILogger logger : loggers) {
			logger.log(instructor.getInstructorName());
		}
		
	}


	@Override
	public void Update(Instructor instructor) {
		instractorDao.Update(instructor);
		
		for(ILogger logger : loggers) {
			logger.log(instructor.getInstructorName());
		}
		
	}


	@Override
	public void Delete(Instructor instructor) {
		
		instractorDao.Delete(instructor);
		
		for(ILogger logger : loggers) {
			logger.log(instructor.getInstructorName());
		}
		
	}

}

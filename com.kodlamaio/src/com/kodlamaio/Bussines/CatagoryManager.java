package com.kodlamaio.Bussines;

import com.kodlamaio.DataAccess.Catagory.ICatagoryDao;
import com.kodlamaio.Entities.Catagory;
import com.kodlamaio.core.Logger.ILogger;

public class CatagoryManager implements ICatagoryService {

	private ICatagoryDao catagoryDao;
	private ILogger[] loggers;
	
	public CatagoryManager(ICatagoryDao catagoryDao, ILogger[] loggers) {
		this.catagoryDao = catagoryDao;
		this.loggers = loggers;
	}

	@Override
	public void Add(Catagory catagory) {
		catagoryDao.Add(catagory);
		
		for(ILogger logger : loggers) {
			logger.log(catagory.getCatagoryName());
		}
		
	}

	@Override
	public void Update(Catagory catagory) {
		catagoryDao.Update(catagory);
		
		for(ILogger logger : loggers) {
			logger.log(catagory.getCatagoryName());
		}
		
	}

	@Override
	public void Delete(Catagory catagory) {
		catagoryDao.Delete(catagory);
		
		for(ILogger logger : loggers) {
			logger.log(catagory.getCatagoryName());
		}
		
	}
	
	
}

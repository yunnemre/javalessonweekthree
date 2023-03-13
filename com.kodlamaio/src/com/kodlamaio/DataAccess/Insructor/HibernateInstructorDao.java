package com.kodlamaio.DataAccess.Insructor;

import com.kodlamaio.Entities.Instructor;

public class HibernateInstructorDao implements IInstructorDao{

	@Override
	public void Add(Instructor instractor) {
		System.out.println("Hibernate Instractor eklendi");
		
	}

	@Override
	public void Update(Instructor instractor) {
		System.out.println("Hibernate Instractor güncellendi");
		
	}

	@Override
	public void Delete(Instructor instractor) {
		System.out.println("Hibernate Instractor silindi");
		
	}
	

}

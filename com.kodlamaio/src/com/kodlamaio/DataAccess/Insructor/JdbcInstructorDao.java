package com.kodlamaio.DataAccess.Insructor;

import com.kodlamaio.Entities.Instructor;

public class JdbcInstructorDao implements IInstructorDao {

	@Override
	public void Add(Instructor instractor) {
		System.out.println("Jdbc Instractor eklendi");
		
	}

	@Override
	public void Update(Instructor instractor) {
		System.out.println("Jdbc Instractor güncellendi");
		
	}

	@Override
	public void Delete(Instructor instractor) {
		System.out.println("Jdbc Instractor silindi");
		
	}

}

package com.kodlamaio.DataAccess.Catagory;

import com.kodlamaio.Entities.Catagory;

public class JdbcCatagoryDao implements ICatagoryDao {

	@Override
	public void Add(Catagory catagory) {
		System.out.println("Jdbc Catagory eklendi");
		
	}

	@Override
	public void Update(Catagory catagory) {
		System.out.println("Jdbc Catagory güncellendi");
		
	}

	@Override
	public void Delete(Catagory catagory) {
		System.out.println("Jdbc Catagory silindi");
		
	}
	

}

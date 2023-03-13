package com.kodlamaio.DataAccess.Catagory;

import com.kodlamaio.Entities.Catagory;

public class HibernateCatagoryDao implements ICatagoryDao{

	@Override
	public void Add(Catagory catagory) {
		System.out.println("Hibernate Catagory eklendi");
		
	}

	@Override
	public void Update(Catagory catagory) {
		System.out.println("Hibernate Catagory güncellendi");
		
	}

	@Override
	public void Delete(Catagory catagory) {
		System.out.println("Hibernate Catagory silindi");
		
	}

}

package com.kodlamaio.DataAccess.Course;

import com.kodlamaio.Entities.Course;

public class HibernateCourseDao implements ICourseDao {

	@Override
	public void Add(Course course) {

		System.out.println("Hibernate veri tabanına eklendi");
	}

	@Override
	public void Update(Course course) {

		System.out.println("Hibernate Kurs güncellendi");

	}

	@Override
	public void Delete(Course course) {

		System.out.println("Hibernate Kurs silindi");

	}

}

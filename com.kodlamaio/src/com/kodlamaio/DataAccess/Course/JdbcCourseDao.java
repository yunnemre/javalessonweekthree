package com.kodlamaio.DataAccess.Course;

import com.kodlamaio.Entities.Course;

public class JdbcCourseDao implements ICourseDao {

	@Override
	public void Add(Course course) {
		System.out.println("Jdbc veri tabanına eklendi");

	}

	@Override
	public void Update(Course course) {
		System.out.println("Kurs güncellendi");

	}

	@Override
	public void Delete(Course course) {

		System.out.println("Kurs silindi");

	}

}

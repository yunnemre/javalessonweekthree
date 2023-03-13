package com.kodlamaio.Entities;

public class Catagory {

	private int Id;
	private String CatagoryName;

	public Catagory() {
		super();
	}

	public Catagory(int id, String catagoryName) {
		super();
		Id = id;
		CatagoryName = catagoryName;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCatagoryName() {
		return CatagoryName;
	}

	public void setCatagoryName(String catagoryName) {
		CatagoryName = catagoryName;
	}

}

package com.qa.abstraction;

public class Vehicle {
	protected int id;
	protected String model;
	protected int year;
	protected String manufacturer;
	protected String type;

	public Vehicle(int id, String model, int year, String manufacturer, String type) {
		this.id = id;
		this.model = model;
		this.year = year;
		this.manufacturer = manufacturer;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int i) {
		this.id = i;
	}

	public String getType() {
		return type;
	}

	public void setType(String s) {
		this.type = s;
	}

	public String getmodel() {
		return model;
	}

	public void setModel(String m) {
		this.model = m;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int i) {
		this.year = i;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String m) {
		this.manufacturer = m;
	}

}

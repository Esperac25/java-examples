package com.qa.abstraction;

public class Vehicle {
	protected String model;
	protected int year;
	protected String manufacturer;
	
	public Vehicle(String model, int year, String manufacturer) {
		this.model = model;
		this.year = year;
		this.manufacturer = manufacturer;
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

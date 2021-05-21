package com.qa.abstraction;

public class Car extends Vehicle {
	protected String color;
	protected int monthlyPayment;

	public Car(String model, int year, String manufacturer, String type, String color, int monthlyPayment) {
		super(model, year, manufacturer, type);
		this.color = color;
		this.monthlyPayment = monthlyPayment;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String c) {
		this.color = c;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", monthlyPayment=" + monthlyPayment + ", getId()=" + getId() + ", getType()="
				+ getType() + ", getmodel()=" + getmodel() + ", getYear()=" + getYear() + ", getManufacturer()="
				+ getManufacturer() + "]";
	}

}

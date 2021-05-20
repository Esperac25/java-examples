package com.qa.abstraction;

public class Car extends Vehicle {
	protected String color;
	protected int monthlyPayment;

	public Car(int id, String model, int year, String manufacturer, String type, String color, int monthlyPayment) {
		super(id, model, year, manufacturer, type);
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
		return ("ID: " + this.id + "\n" + "Type: " + this.type + "\n" + "Model: " + this.model + "\n" + "Year: "
				+ this.year + "\n" + "Manufacturer: " + this.manufacturer + "\n" + "Color: " + this.color + "\n"
				+ "Monthly Payment: " + this.monthlyPayment);
	}
}

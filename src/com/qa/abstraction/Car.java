package com.qa.abstraction;

public class Car extends Vehicle {
	protected String color;
	protected int monthlyPayment;
	
	public Car(String model, int year, String manufacturer, String color, int monthlyPayment) {
		super(model, year, manufacturer);
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
      return (
        "Model: " +
        this.model +
        "\n" +
        "Year: " +
        this.year +
        "\n" +
        "Manufacturer: " +
        this.manufacturer +
        "\n" +
        "Color: " +
        this.color +
        "\n" +
        "Monthly Payment: " +
        this.monthlyPayment
      );
    }
}

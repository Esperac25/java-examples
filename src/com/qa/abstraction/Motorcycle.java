package com.qa.abstraction;

public class Motorcycle extends Vehicle {
	protected boolean isRunning;
	protected String color;

	public Motorcycle(int id, String model, int year, String manufacturer, String type, boolean isRunning,
			String color) {
		super(id, model, year, manufacturer, type);
		this.isRunning = isRunning;
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String c) {
		this.color = c;
	}

	public void setIsRunning(boolean b) {
		this.isRunning = b;
	}

	public boolean getIsRunning() {
		return isRunning;
	}

	@Override
	public String toString() {
		return ("ID: " + this.id + "\n" + "Type: " + this.type + "\n" + "Model: " + this.model + "\n" + "Year: "
				+ this.year + "\n" + "Manufacturer: " + this.manufacturer + "\n" + "Engine Running: "
				+ this.getIsRunning() + "\n" + "Color: " + this.color + "\n");
	}
}

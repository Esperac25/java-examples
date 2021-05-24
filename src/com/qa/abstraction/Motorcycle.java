package com.qa.abstraction;

public class Motorcycle extends Vehicle {
	protected boolean isRunning;
	protected String color;

	public Motorcycle(String model, int year, String manufacturer, String type, boolean isRunning,
			String color) {
		super(model, year, manufacturer, type);
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
		return "Motorcycle [isRunning=" + isRunning + ", color=" + color + ", getId()=" + getId() + ", getType()="
				+ getType() + ", getmodel()=" + getmodel() + ", getYear()=" + getYear() + ", getManufacturer()="
				+ getManufacturer() + "]";
	}
	
	
}

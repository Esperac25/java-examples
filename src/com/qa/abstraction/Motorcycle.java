package com.qa.abstraction;

public class Motorcycle extends Vehicle{
	protected boolean isRunning;
	protected String color;
	
	public Motorcycle(String model, int year, String manufacturer, boolean isRunning, String color) {
		super(model, year, manufacturer);
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
        "Engine Running: " +
        this.getIsRunning()+
        "\n" +
        "Color: " +
        this.color +
        "\n"
      );
    }
}

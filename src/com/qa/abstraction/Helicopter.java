package com.qa.abstraction;

public class Helicopter extends Vehicle{
	protected boolean inFlight;
	
	public Helicopter(String model, int year, String manufacturer, String type, boolean inFlight) {
		super(model, year, manufacturer, type);
		this.inFlight = inFlight;
	}

	public boolean isInFlight() {
		return inFlight;
	}

	public void setInFlight(boolean inFlight) {
		this.inFlight = inFlight;
	}

	@Override
	public String toString() {
		return "Helicopter [inFlight=" + inFlight + ", isInFlight()=" + isInFlight() + "]";
	}

}

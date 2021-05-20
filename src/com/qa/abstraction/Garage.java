package com.qa.abstraction;
import java.util.List;

public class Garage {
	protected List<Vehicle> vehicleList;
	
	public Garage(List<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}
	public void addVehicle(Vehicle v) {
		this.vehicleList.add(v);
	}
	public List<Vehicle> viewList() {
		return vehicleList;
	}
}

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
	public void removeVehicle(Vehicle v) {
		this.vehicleList.remove(v);
	}
	public String removeById(int id) {
		for(int i = 0; i < vehicleList.size(); i++) {
			if(vehicleList.get(i).getId() == id) {
				vehicleList.remove(id);
				return "Vehicle with Id: "+ id + " was successfully removed";
			}
		}
		return "Vehicle with Id: " + id + " was not found";
	}
	@SuppressWarnings("unlikely-arg-type")
	public void removeByType(Vehicle v) {
		this.vehicleList.remove(v.getType());
	}
	public List<Vehicle> viewList() {
		return vehicleList;
	}
	public void fixVehicle(Vehicle v){
		int bill = 0;
		if(v.type == "Car") {
			bill += 200;
		} else if (v.type == "Helicopter"){
			bill += 10000;
		} else {
			bill += 100;
		}
		System.out.println("$"+bill);
	}
	public void closeUpShop(List<Vehicle> vehicleList) {
		this.vehicleList.clear();
		System.out.println("Closing time, the garage is now empty!");
	}
}

//3). Create a method in Garage that iterates through each Vehicle, calculating a bill for each type of Vehicle in a different way, 
//depending on the type of vehicle it is.  You can decide how this bill is calculated based on any attributes you see fit. 
//(You do not get extra marks for making the calculation overly complex) 
//
//
//
//4). Garage should have methods that add Vehicle, remove Vehicle(s) (By ID, By Vehicle Type) fix Vehicle (Calculate bill) 
//and empty the garage
package com.qa.runner;

import java.util.ArrayList;
import java.util.List;

import com.qa.abstraction.Car;
import com.qa.abstraction.Garage;
import com.qa.abstraction.Motorcycle;
import com.qa.abstraction.Vehicle;

////import com.qa.conditionals.BlackJack;
////import com.qa.conditionals.Calculator;
////import com.qa.enhancedforloops.ForLoop1;
//import com.qa.inheritance.Person;
//import com.qa.inheritance.Trainee;
//import com.qa.inheritance.Employee;
//import com.qa.strings.TwoString;
//import com.qa.constructors.Book;

public class Runner {
	public static int[] int1 = { 1, 2, 3, 4, 5 };

	public static void main(String[] args) {
//		System.out.println("Hello World");
//		System.out.println(Calculator.addCalc(2, 3));
//		BlackJack.greeting();
//		BlackJack.startGame(20,2);
//		ForLoop1.myBool(5);
//		ForLoop1.cubeOrSquare(int1);
//		System.out.println(TwoString.strCount("What is the word count of this string?"));
//		
//		Person esperanza = new Person("Esperanza", 26, "female");
//		Book theMakeBelieve = new Book("The Make Believe", "unknown", "non-fiction", 200, 50, false);
//		
//		
//		System.out.println(esperanza.speak("Hello, nice to meet you!"));
//		esperanza.setName("Mia");
//		esperanza.setName("Esperanza");
//		System.out.println(esperanza.getName());
//		esperanza.read(theMakeBelieve.getTitle());
//		theMakeBelieve.overview();
//		Person esperanza = new Person("Esperanza", 26, "female");
//		Trainee trainee = new Trainee(esperanza.getName(), esperanza.getAge(), esperanza.getGender(), 10000);
//		Employee employee = new Employee(esperanza.getName(), esperanza.getAge(), esperanza.getGender(), 80000);
//		System.out.println(trainee.getBursary());
//		
//		trainee.addSubject("chemistry");
//		trainee.addSubject("computer-programming");
//		System.out.println(trainee.getSubjectsLearned());
//		System.out.println(employee.calculateWeeklySalary());
//		employee.employeeDetails();
//		trainee.traineeDetails();
		Car nissan = new Car(1, "Nissan Sentra", 2008, "Toyota", "Car", "blue", 8000);
		Motorcycle harley = new Motorcycle(2, "Harley", 2002, "Harley Davidson", "Motorcycle", false, "red");
		List<Vehicle> vehicleList = new ArrayList<Vehicle>();
		Garage myGarage = new Garage(vehicleList);

		myGarage.addVehicle(nissan);
		myGarage.addVehicle(harley);
		System.out.println(myGarage.viewList());
		myGarage.fixVehicle(harley);
		myGarage.closeUpShop(vehicleList);
		System.out.println(myGarage.viewList());
	}

}

package com.qa.inheritance;


public class Employee extends Person{
	private double annualSalary;
	private double weeklySalary;
	
	public Employee(String name, int age, String gender, double annualSalary) {
		super(name, age, gender);
		this.annualSalary = annualSalary;
		this.weeklySalary = calculateWeeklySalary();
	}
	
	public double calculateWeeklySalary(){ 
		return this.annualSalary/52;// 52 working weeks out of a year
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(double i) {
		this.annualSalary = i;
	}
	public double getWeeklySalary() {
		return weeklySalary;
	}
	public void setWeeklySalary(double i) {
		this.weeklySalary = i;
	}
}
	

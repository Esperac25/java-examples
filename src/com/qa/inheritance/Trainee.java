package com.qa.inheritance;
import java.util.ArrayList;
import java.util.List;

public class Trainee extends Person{
	private double bursary;
	private List<String> subjectsLearned = new ArrayList<>();
	
	public Trainee(String name, int age, String gender, double bursary) {
		super(name, age, gender);
		this.bursary = bursary;
	}
	public double getBursary() {
		return bursary;
	}
	public void setBursary(int i) {
		this.bursary = i;
	}
	public String getSubjectsLearned() {
		String subjects = "";
		for(int i = 0; i < subjectsLearned.size(); i++) {
			subjects += subjectsLearned.get(i)+ "\n";
		}
		return subjects;
	}
	public void addSubject(String i) {
		this.subjectsLearned.add(i);
	}
	public void traineeDetails() {
	    System.out.println(super.name+ ", " + super.age + ", " + super.gender + ", " + this.getBursary() + ", " + getSubjectsLearned());
	    
	  }
	
}

//a field bursary of type double
//a list of subjects learned as a field called subjectsLearned
//a method addSubject() for adding a new subject to the list.
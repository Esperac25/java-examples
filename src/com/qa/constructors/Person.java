package com.qa.constructors;


public class Person {
	private String name; //
	private int age; //
	private String gender; //
	private boolean isBreathing;
	private int walkSpeed; // in feet
// Constructor

	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public void read(String a) {
		System.out.println(this.name + " is reading the book titled: "+a);
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		this.name = n;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int a) {
		this.age = a;
	}
	public void setGender(String gen) {
		this.gender = gen;
	}
	public String getGender() {
		return gender;
	}
	public boolean getIsStillBreathing() {
		return isBreathing;
	}
	public void setIsStillBreathing(boolean b) {
		this.isBreathing = b;
	}
	public int getWalk() {
		return walkSpeed;
	}
	public void setWalk(int w) {
		this.walkSpeed = w;
	}

	public String speak(String msg) {
		return this.name + " says: " + msg;
	}

	
}

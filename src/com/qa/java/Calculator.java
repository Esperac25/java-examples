package com.qa.java;


public class Calculator {

	public static void main(String[] args) {
		System.out.println(addCalc(5,9));
		System.out.println(subCalc(5,10));
		System.out.println(multiCalc(20,30));
		System.out.println(divCalc(3,290));
	}

	public static int addCalc(int i, int j) {
		return i + j;
	}

	public static int subCalc(int i, int j) {
		return i - j;

	}

	public static int multiCalc(int i, int j) {
		return i * j;
	}

	public static double divCalc(double i, double j) {
		return i / j;

	}

}
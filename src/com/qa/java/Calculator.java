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

	public static String divCalc(int i, int j) {
		if(i < j) {
			double res = i/j;
			String msg = "The result is "+res;
			return msg;
		} else {
			String msg = "The division can't be performed";
			return msg;
		}

	}

}
package com.qa.conditionals;


public class Calculator {

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
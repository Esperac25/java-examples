package com.qa.java;

public class Taxes {
	
	public static void main(String[] args) {
		System.out.println(tax(15000.00));
		System.out.println(amountTaxed(15000.00));
	}
	public static double tax(double i) {
		if(i <= 14999) {
		    return .0;
		} else if(i >= 15000 && i <= 19999) {
			return .10;	
		} else if(i >= 20000 && i <= 29999) {
			return .15;
		} else if (i >= 30000 && i <= 44999) {
			return .20;
		} else {
			return .25;
		}
		
	}
	
	public static double amountTaxed(double i) {
		return i - (tax(i)*i);
	}
}

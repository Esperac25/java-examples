package com.qa.conditionals;

public class Tax {
	
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

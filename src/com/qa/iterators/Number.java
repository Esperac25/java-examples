package com.qa.iterators;


public class Number {

	
	public static int add(int num) {
		return (int) ((num % 10) + Math.floor(num / 10));
	}
	
	
	public static String[] ones = {"one", "two", "three", "four", "five", "six", "seven","eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen","fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};	
	public static String[] tens = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy","eighty", "ninety"};

	public static String numTens(int num) {
		if(num <= 0 || num >= 100) return "Invalid Input";
		else if(num < 20) return ones[num-1];
		else {
			if((num%10)-1 > 0) return tens[(int)Math.floor(num/10)-1]+"-"+ones[(num%10)-1];				
			else return tens[(int)Math.floor(num/10)-1];
		}
	}
	
	// in progress, got help with this challenge from team mate;
	public static String numHundreds(int num) {
		if(num <= 0 || num >= 1000) return "Invalid Input";
		else if(num < 20) return ones[num-1];
		else if(num >= 20 && num <= 99)
			if((int)Math.floor(num/10)-1 > 0)return tens[(int)Math.floor(num/10)-1]+"-"+ones[(num%10)-1];
			else return tens[(int)Math.floor(num/10)-1];
		else {
			if(((int)Math.floor(num/10)-1)%10 > 0 && (num%10)-1 > 0)return ones[(int)Math.floor(num/100)-1] + " hundred " + tens[((int)Math.floor(num/10)-1)%10]+ " " + ones[(num%10)-1];
			else if(((int)Math.floor(num/10)-1)%10 > 0) return ones[(int)Math.floor(num/100)-1] + " hundred " + tens[((int)Math.floor(num/10)-1)%10];
			else return ones[(int)Math.floor(num/100)-1] + " hundred";
		}
	}
	
}


package com.qa.conditionals;

public class FizzBuzz {

	public static String fizzBuzz(int i) {
		if(i % 3 == 0 && i % 5 == 0) {
			String msg = "FizzBuzz";
			System.out.println(msg);
			return msg;
		} else if (i % 3 == 0) {
			String msg = "Fizz";
			System.out.println(msg);
			return msg;
		} else if (i % 5 == 0) {
			String msg = "Buzz";
			System.out.println(msg);
			return msg;
		} else {
			String msg = ""+ i + "";
			System.out.println(msg);
			return msg;
		}
	}

}

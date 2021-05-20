package com.qa.strings;

public class TwoString {

	public static String twoString(String str1, String str2) {
		String msg = str2.toUpperCase()+", "+str1.toUpperCase();
		System.out.println(msg);
		return msg;
		
	}
	public static int strCount(String str) {
		int x = 1;
		for(int i = 0; i < str.length(); i++) {
			if(str.substring(i, i+1).equals(" ")) {
				x+=1;
			}
		}
		return x;
	}

}

//Create two Strings where one string has a value of “yesterday it was raining” and the other string with a value of “today it is sunny”
//
//Concatenate both values, capitalise both strings and print out the result.
//The result should be: TODAY IT IS SUNNY, YESTERDAY IT WAS RAINING
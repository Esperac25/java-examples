package com.qa.array;

public class IntArray1 {
	public static int numbers[] = {1,2,3,4,5,6,7,8,9,10};
	
	public static void index(int num) {
		 System.out.println(num);
	}
	
	public static void main(String[] args) {
		for(int num : numbers) {
			index(num);
		}

	}
	
}

//Create an array that will hold 10 integer values,
//populate the array with values, 
//then call and output each element.
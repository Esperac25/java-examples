package com.qa.array;

public class IntArray2 {
	public static int[] arr = new int[10];
	
	public static void main(String[] args) {
		for(int i = 0; i<10; i++) {
			arr[i] = i++;
			for(int j=0; j<10; j++) {
				System.out.println(j+10);
			}
		}
	}
}

//Create a for loop that populates an integer array
//with values, outputting them at each iteration.
//Then create another loop that iterates 
//through the array, changing the values at
//each point to equal itself times 10, 
//outputting them at each iteration.

package com.qa.array;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Array2 {
	public static void main(String[] args){
		List<String> arr1 = new ArrayList<>();
		arr1.add("a");
		arr1.add("b");
		arr1.add("c");
		arr1.add("d");
		arr1.add("e");
		arr1.add("f");
		arr1.add("g");
		System.out.println(arr1.toString());
		for(int i = 0; i < arr1.size(); i++) {
			System.out.println(arr1.get(i));
		}
		arr1.set(0, "what-what");
		System.out.println(arr1.toString());
		arr1.remove(0);
		Collections.sort(arr1);
		Collections.reverse(arr1);
		Collections.swap(arr1, 0, 3);
		System.out.println(arr1.toString());
		

    }
	
}



//create a new ArrayList
//add() several elements
//print out the entire ArrayList
//iterate through the ArrayList and print out each element (with both normal and enhanced for-loops)
//get() specific elements
//set() different elements
//remove() elements
//sort() the ArrayList (try this with several object types)
//try using the reverse(), swap() and clone() methods from the Collections class

package com.qa.enhancedforloops;

public class ForLoop1 {
	public static String[] str1= {"Hello","how", "are", "you"};
	public static int[] int1= {1,2,3,4,5};
	
	public static void stringArr(String[] str1) {
		for(String str : str1) {
			System.out.println(str);
		}
	}
	public static void intArr(int[] int1) {
		for(int i : int1) {
			System.out.println(i*i);
		}
	}
	public static boolean myBool(int i) {
		boolean b;
		if(i % 2 == 0) {
			b = true;
			
		} else {
			b = false;
		}
		System.out.println(b);
		return b;
	}
	public static void cubeOrSquare(int[] int1) {
		for(int i: int1) {
			boolean b = myBool(i);
			int s;
			if(b == true) {
				 s = i*i*i;
			} else {
				 s = i*i;
			}
			System.out.println(s);
		}
		
		
	}

}


//Create an array of strings and iterate through it,
//printing each value to console, using an enhanced 
//for loop.
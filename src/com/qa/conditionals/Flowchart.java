package com.qa.conditionals;

public class Flowchart {

	public static int mult(int i, int j, boolean B) {
		if(B == false) {
			return Calculator.multiCalc(i, j);
		} else {
			return Calculator.addCalc(i, j);
		}
	}
	
	public static String chart(int i) {
		if(i > 2000) {
			System.out.println("A");
			if(i >6000) {
				System.out.println("C");
			}else {
				System.out.println("B");
				if(i > 4000) {
					System.out.println("D");
				}else {
					System.out.println("E");
				}
			}
		}else {
			System.out.println("1");
			if(i > 100) {
				System.out.println("3");
				if(i > 600) {
					System.out.println("5");
				}else {
					System.out.println("4");
					if(i > 500) {
						System.out.println("6");
					}else {
						System.out.println("7");
					}
				}
			}else {
				System.out.println("2");
			}
		}
		
		return "End";
	}
}

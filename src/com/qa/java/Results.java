package com.qa.java;


public class Results {
	
	public static int physics = 150;
	
	public static int chemistry = 150;
	
	public static int biology = 150;
	
	public static int total = 450;
	
	public static double percentage = 100;
	

	
	public static void main(String[] args) {
		studentMarks(physics-20,chemistry-5,biology-30);
		studentPercentage(physics-20,chemistry-5,biology-30);

	}
	
	public static String studentMarks(int i, int j, int k){
		System.out.println("physics = "+ i + " chemistry = "+ j +" biology = "+k);
		int res = i + j + k;
		String msg = "total marks = "+ res;
		System.out.println(msg);
		return msg;
	}
	public static String studentPercentage(int i, int j, int q) {
		 int totalMarks = i + j + q;
		 double res = (totalMarks * 100)/total;
		 String msg = "total percentage = "+ res + "%";
		 System.out.println(msg);
		 return msg;
	}
}


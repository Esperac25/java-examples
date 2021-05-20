package com.qa.conditionals;


public class Result {
	
	public static int physics = 150;
	
	public static int chemistry = 150;
	
	public static int biology = 150;
	
	public static int total = 450;
	
	public static double percentage = 100;
	
	public static int pass = 60;
	
	public static String studentMarks(int i, int j, int k){
		System.out.println("physics = "+ i + " chemistry = "+ j +" biology = "+k);
		int res = i + j + k;
		String msg = "total marks = "+ res;
		System.out.println(msg);
		return msg;
	}
	public static String studentPercentage(int i, int j, int q) {
		 int totalMarks = i + j + q;
		 double res = totalMarks * 100/total;
		 String msg = "total percentage = "+ res + "%";
		 System.out.println(msg);
		 return msg;
	}
	public static String passOrFail(int i, int j, int q) {
		int totalMarks = i + j + q;
		double sum = totalMarks * 100/total;
		if(i <= 90 || j <= 90 || q <= 90) {
			String msg = "You have failed one or more classes of the following: "+"physics = "+ i + ", chemistry = "+ j +", biology = "+q;
			System.out.println(msg);
			return msg;
		} else if(sum <= 60){
			String msg = "You have failed with an overall score of "+sum+"%";
			System.out.println(msg);
			return msg;
		} else {
			String msg = "You have passed with an overall score of "+sum+"%";
			System.out.println(msg);
			return msg;
		}
	}
}


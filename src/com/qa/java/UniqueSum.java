package com.qa.java;

public class UniqueSum {

	public static void main(String[] args) {
		sum(1,2,3);
		sum(1,2,1);
		
	}
	public static int sum(int i, int j, int k) {
		int res = i + j + k;
		if(i == j || j == k || k == i || k == j) {
			res = 0;
		}
		System.out.println(res);
		return res;
	}

}

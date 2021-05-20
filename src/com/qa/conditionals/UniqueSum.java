package com.qa.conditionals;

public class UniqueSum {

	public static int sum(int i, int j, int k) {
		int res = i + j + k;
		if(i == j || j == k || k == i || k == j) {
			res = 0;
		}
		System.out.println(res);
		return res;
	}

}

package com.qa.java;

public class BlackJack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		greeting();
		startGame(20,2);

	}
	public static String greeting() {
		String msg = "Hello and welcome to BlackJack, let's play!";
		System.out.println(msg);
		return msg;
	}
	
	public static int startGame(int i, int j) {
		if(i >= 21 || j >= 21) {
			int res = 0;
			System.out.println(res);
			return res;
		} else if(i < j ) {
			int res = j;
			System.out.println(res);
			return res;
		} else {
			int res = j;
			System.out.println(res);
			return res;
		}
	}

}

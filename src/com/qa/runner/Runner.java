package com.qa.runner;
import com.qa.conditionals.BlackJack;
import com.qa.conditionals.Calculator;
import com.qa.enhancedforloops.ForLoop1;
import com.qa.strings.TwoString;
import com.qa.constructors.Person;
import com.qa.constructors.Book;

public class Runner {
	public static int[] int1= {1,2,3,4,5};
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println(Calculator.addCalc(2, 3));
		BlackJack.greeting();
		BlackJack.startGame(20,2);
		ForLoop1.myBool(5);
		ForLoop1.cubeOrSquare(int1);
		System.out.println(TwoString.strCount("What is the word count of this string?"));
		
		Person joe = new Person("Joe", 26, "male");
		joe.read();
		
		Book aBook = new Book("A Book", "Joe", "Fiction", 100, 20);
		aBook.overview();
		aBook.cost();
	}

}

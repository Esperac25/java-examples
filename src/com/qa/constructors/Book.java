package com.qa.constructors;

public class Book {
		public String title;
		public String author;
		public String genre;
		public int pageCount;
		public int cost;
		public boolean isAvailable;
		
		
		public Book(String title, String author, String genre, int pageCount, int cost) {
			this.title = title;
			this.author = author;
			this.genre = genre;
			this.pageCount = pageCount;
			this.cost = cost;
			
		}
		public void overview() {
			System.out.println(this.title + ", wrtten by: "+this.author+", genre: "+this.genre+", pages: "+this.pageCount+", cost: $"+this.cost);
		}
		public boolean availability() {
			return isAvailable;
		}
		public void cost() {
			System.out.println("$"+cost);
		}
		
}

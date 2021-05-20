package com.qa.constructors;

public class Book {
		private String title;
		private String author;
		private String genre;
		private int pageCount;
		private int cost;
		private boolean isAvailable;
		
		
		
		public Book(String title, String author, String genre, int pageCount, int cost, boolean isAvailable) {
			this.title = title;
			this.author = author;
			this.genre = genre;
			this.pageCount = pageCount;
			this.cost = cost;
			this.isAvailable = isAvailable;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String s) {
			this.title = s;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String s) {
			this.author = s;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String s) {
			 this.genre = s;
		}
		public int getPageCount() {
			return pageCount;
		}
		public void setPageCount(int i) {
			this.pageCount = i;
		}
		public void getCost() {
			System.out.println("$"+cost);
		}
		public void setCost(int i) {
			this.cost = i;
		}
		public boolean getisAvailable() {
			return isAvailable;
		}
		public void setIsAvailable(boolean b) {
			this.isAvailable = b;
		}
		
		public void overview() {
			System.out.println(this.title + ", wrtten by: "+this.author+", genre: "+this.genre+", pages: "+this.pageCount+", cost: $"+this.cost);
		}
		
		
		
		
}


//To achieve encapsulation, then:
//
//    make the class variables private
//    provide public accessors to these variables: getters and setters

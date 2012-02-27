package org.totalbeginner.tutorial;

public class Person {
	// fields
	private String name;
	private int maximumBooks;
	
	// constructors
	public Person(){
		name = "unknown name";
		maximumBooks = 3;
	}
	
	//methods
	public String getName() {
		return name;
	}
	
	public void setName(String anyName){
		name = anyName;
	}

	public int getMaximumBooks() {
		return maximumBooks;
	}

	public void setMaximumBooks(int maximumBooks) {
		this.maximumBooks = maximumBooks;
	}
	
	public String toString() {
		return this.getName() + " (" + this.getMaximumBooks() + " books)";
	}
}

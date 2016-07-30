/** Program:  13.11 Octagon
  * File:     GeometricObject.java 
  * Summary:  Chapter 13, Exercise 11, Write a class named Octagon that extends GeometricObject and implements the 
 * 		Comparable and Cloneable inter-faces. Write a test program that creates an 
 * 		Octagonobject with side value 5 and displays its area and perimeter. Create 
 * 		a new object using the clone method and compare the two objects using the 
 * 		compareTo method.
  * Author:   Eric Roberts
  * Date:     July 30, 2016
**/
public abstract class GeometricObject {
	//data fields
	private String color = "while";
	private boolean filled;
	private java.util.Date dateCreated;
	
	//construct default object
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}
	
	//construct object with color and filled
	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	//getters
	public String getColor() {
		return color;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	//setters
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	//boolean
	public boolean isFilled() {
		return filled;
	}
	
	//override String
	@Override
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
	
	//abstract methods
	public abstract double getArea();
	
	public abstract double getPerimeter();
}

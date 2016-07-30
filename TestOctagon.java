/** Program:  13.11 Octagon
  * File:     TestOctagon.java 
  * Summary:  Chapter 13, Exercise 11, Write a class named Octagon that extends GeometricObject and implements the 
 * 		Comparable and Cloneable inter-faces. Write a test program that creates an 
 * 		Octagonobject with side value 5 and displays its area and perimeter. Create 
 * 		a new object using the clone method and compare the two objects using the 
 * 		compareTo method.
  * Author:   Eric Roberts
  * Date:     July 30, 2016
**/
public class TestOctagon {
	
	//main
	public static void main(String[] args) throws CloneNotSupportedException {
		
		//create Octagon
		Octagon oct1 = new Octagon(5);
		
		//print area perimeter
		System.out.println("\nOctagon:\nArea: " + oct1.getArea() + "\nPerimeter: " + oct1.getPerimeter());
		
		
		//create object using cloning
		System.out.println("Cloning Octagon...");
		Octagon oct2 = (Octagon)oct1.clone();
		
		//compare objects
		int result = (oct1.compareTo(oct2));
		if (result == 1)
			System.out.println("Octagon is greater than clone.");
		else if (result == -1)
			System.out.println("Octagon is less than clone.");
		else
			System.out.println("Octagon is equal to clone.");
	}

}

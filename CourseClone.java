/** Program:  13.13 Course
  * File:     Course.java 
  * Summary:  Chapter 13, Exercise 13, Rewrite the Course class in Listing 10.6 to add a clone method
  * Author:   Eric Roberts
  * Date:     July 30, 2016
**/
public class CourseClone {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Course math134 = new Course("math134");
		
		//add students
		math134.addStudent("Jessica");
		math134.addStudent("Ella");
		math134.addStudent("Ivy");
		
		Course math154 = (Course)math134.clone();
		
		//compare
		System.out.println("Compare courses: " + (math134 == math154));
		System.out.println("Compare students: " + (math134 == math154));
	}

}

/** Program:  13.16 Course
  * File:     Calculations.java 
  * Summary:  Chapter 13, Exercise 13, Write a program similar to Listing 7.9, Calculator.java. Instead of using integers, 
 * 		use rationals, as shown in Figure 13.10a
  * Author:   Eric Roberts
  * Date:     July 30, 2016
**/
public class Calculations {
	//main
	public static void main(String[] args) {
		//check command line
		if (args.length != 1) {
			System.out.println("Calculations");
			System.exit(0);
		}
		
		//create string
		String output = args[0];
		
		//get numerator and denominator
		String[] str = (args[0].replaceAll(" ", "/")).split("/");
		
		//create objects
		RationalCalculation r1 = new RationalCalculation(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
		RationalCalculation r2 = new RationalCalculation(Integer.parseInt(str[3]), Integer.parseInt(str[4]));
		
		switch (str[2].charAt(0)) {
		case '+' : output += " = " + r1.add(r2);	break;
		case '-' : output += " = " + r1.subtract(r2); break;
		case '.' : output += " = " + r1.multiply(r2); break;
		case '/' : output += " = " + r1.divide(r2); break;
		default : System.out.println("Illegal Argument: + - . /"); 
					System.exit(0);
	}
		
		//print results
		System.out.println(output);
		
	}

}

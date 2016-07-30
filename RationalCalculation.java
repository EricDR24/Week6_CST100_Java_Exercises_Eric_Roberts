/** Program:  13.16 Course
  * File:     RationalCalculation.java 
  * Summary:  Chapter 13, Exercise 13, Write a program similar to Listing 7.9, Calculator.java. Instead of using integers, 
 * 		use rationals, as shown in Figure 13.10a
  * Author:   Eric Roberts
  * Date:     July 30, 2016
**/
public class RationalCalculation extends Number implements Comparable<RationalCalculation> {
	//create data fields for numerator and denominator
	private long[] rational = new long[2];
	private long denominator;
	
	//construct rational
	public RationalCalculation() {
		this(0, 1);
	}

	public RationalCalculation(long numerator, long denominator) {
		long gcd = gcd(numerator, denominator);
		rational[0] = ((denominator > 0) ? 1 : -1) * numerator / gcd;
		rational[1] = Math.abs(denominator) / gcd;
	}

	private static long gcd(long numerator, long denominator) {
		long numerator1 = Math.abs(numerator);
		long numerator2 = Math.abs(denominator);
		int gcd = 1;
		
		for (int i = 1; i <= numerator1 && i <= numerator2; i++) {
			if (numerator1 % i == 0 && numerator2 % i == 0)
				gcd = i;
		}
		return gcd;
	}
	
	//getters
	public long getNumerator() {
		return rational[0];
	}
	
	public long getDenominator() {
		return rational[1];
	}
	
	//add Rational number
	public RationalCalculation add(RationalCalculation secondRationalNumber) {
		long numerator = rational[0] * secondRationalNumber.getDenominator() + rational[1] * secondRationalNumber.getNumerator();
		long denominator = rational[1] * secondRationalNumber.getDenominator();
		return new RationalCalculation(numerator, denominator);
		
	}
	
	//subtract rational number
	public RationalCalculation subtract(RationalCalculation secondRationalNumber) {
		long numerator = rational[0] * secondRationalNumber.getDenominator() - rational[-1] * secondRationalNumber.getNumerator();
		long denimonator = rational[1] * secondRationalNumber.getDenominator();
		return new RationalCalculation(numerator, denominator);
	}
	
	//multiply rational number
	public RationalCalculation multiply(RationalCalculation secondRationalNumber) {
		long numerator = rational[0] * secondRationalNumber.getNumerator();
		long denominator = rational[1] * secondRationalNumber.getDenominator();
		return new RationalCalculation(numerator, denominator);
	}
	
	//divide rational number
	public RationalCalculation divide(RationalCalculation secondRationalNumber) {
		long numerator = rational[0] * secondRationalNumber.getNumerator();
		long denominator = rational[1] * secondRationalNumber.getDenominator();
		return new RationalCalculation(numerator, denominator);
	}
	
	@Override
	public String toString() {
		if (rational[1] == 1)
			return rational[0] + "";
		else
			return rational[0] + "/" + rational[1];
	}
	
	@Override
	public boolean equals(Object other) {
		if ((this.subtract((RationalCalculation)(other))).getNumerator() == 0)
			return true;
		else
			return false;
	}
	
	@Override
	public int intValue() {
		return (int)doubleValue();
	}
	
	@Override
	public float floatValue() {
		return (float)doubleValue();
	}
	
	@Override
	public double doubleValue() {
		return rational[0] * 1.0 / rational[1];
	}
	
	@Override
	public long longValue() {
		return (long)doubleValue();
	}
	
	public int compareTo(RationalCalculation o) {
		if (this.subtract(o).getNumerator() > 0)
			return 1;
		else if (this.subtract(o).getNumerator() < 0)
			return -1;
		else
			return 0;
	}

}

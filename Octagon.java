


public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon>  {
	
	//data field
	private double side;
	
	public Octagon() {
		
	}
	
	//construct an octagon with a side
	public Octagon(double side) {
		this.side = side;
	}
	
	//getters
	public double getSide() {
		return side;
	}
	
	//setters
	public void setSide(double side) {
		this.side = side;
	}
	
	//override getters
	@Override
	public double getArea() {
		return (2 + 4 / Math.sqrt(2)) * side * side;
	}
	
	@Override
	public double getPerimeter() {
		return 8 * side;
	}
	
	//override compare
	public int compareTo(Octagon o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}
	
	//Override protected clone
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	//Override to String
	@Override
	public String toString() {
		return super.toString() + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
	}
	


}

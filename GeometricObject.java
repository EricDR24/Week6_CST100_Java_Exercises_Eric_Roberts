
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

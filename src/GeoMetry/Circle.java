package GeoMetry;

public class Circle extends Shape{

	private double radius;

	public Circle(double x, double y, double radius) {
		this.radius = radius;
		this.setX(x);
		this.setY(y);
	}

	
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}


	/**
	 * Method calculates circumference of the Circle
	 */
	@Override
	public double calculateCircumference() {
		return 2 * this.radius * Math.PI;
	}

	/**
	 * Method calculates area of the Circle
	 */
	@Override
	public double calculateArea() {
		return this.radius * this.radius * Math.PI;
	}
	
}

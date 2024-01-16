package GeoMetry;

public class Circle extends Shape{

	private double radius;

	public Circle(double radius, double x, double y) {
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



	@Override
	public double calculateCircumference() {
		return 2 * this.radius * Math.PI;
	}

	@Override
	public double calculateArea() {
		return this.radius * this.radius * Math.PI;
	}
	
}

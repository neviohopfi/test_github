package GeoMetry;

public class Triangle extends Shape{

	private double a;
	private double b;
	private double c;
	private double height;
	
	
	public Triangle(double x, double y, double a, double b, double c, double height) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.setX(x);
		this.setY(y);
		this.height = height;
	}
	
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}

	public double getHeight() {
		return height;
	}
	
	private void setHeight(double height) {
		this.height = height;
	}
	
	/**
	 * Method calculates circumference of the Triangle
	 */
	@Override
	public double calculateCircumference() {
		return this.a + this.b + this.c;
	}

	/**
	 * Method calculates area of the Triangle
	 */
	@Override
	public double calculateArea() {
		return this.c * this.height/2;
	}

	@Override
	public String toString() {
		return "Triangle: " + "a: " + a + ", b:" + b + ", c:" + c + ", height:" + height;
	}
	
	
	
}

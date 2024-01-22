package GeoMetry;

import java.util.ArrayList;

public class Group {

	private ArrayList<Shape> shapes;

	public Group() {
		this.shapes = new ArrayList<Shape>();
	}

	public ArrayList<Shape> getShapes() {
		return shapes;
	}

	public void setShapes(ArrayList<Shape> shapes) {
		this.shapes = shapes;
	}
	
	
	/**
	 * Method adds shapes 
	 * @param s
	 */
	public void addShape(Shape s) {
		if(!this.shapes.contains(s)) {
			this.shapes.add(s);
		}
	}
	
	/**
	 * Method removes shapes
	 * @param s
	 */
	public void removeShape(Shape s) {
		this.shapes.remove(s);
	}
	
	/**
	 * Method calculates the Areas from all shapes
	 * @return
	 */
	public double calculateSumArea() {
		double a=0;
		for(Shape s : this.shapes) {
			a += s.calculateArea();
		}
		return a;
	}
	
	/**
	 * Method calculates the circumference from all shapes
	 * @return
	 */
	public double calculateSumCircumference() {
		double c = 0;
		for(Shape s : this.shapes) {
			c += s.calculateCircumference();
		}
		return c;
	}
	
	/**
	 * Method prints the Shape with the greatest area
	 * @return s
	 */
	public Shape returnGreatestAreaShape() {
		double max = 0.0;
		Shape greatestShape = null;
		for(Shape s : this.shapes) {
			if(s.calculateArea()>max) {
				max = s.calculateArea();
				greatestShape = s;
			}
		}
		return greatestShape;
	}
	
	/**
	 * Method returns all shapes in a group
	 */
	public void returnGroupedShapes() {
		ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
		ArrayList<Triangle> triangles = new ArrayList<Triangle>();
		ArrayList<Circle> circles = new ArrayList<Circle>();
		for (Shape s : this.shapes) {
			if(s instanceof Rectangle) {
				rectangles.add((Rectangle) s);
			} else if (s instanceof Triangle) {
				triangles.add((Triangle) s);
			} else if (s instanceof Circle) {
				circles.add((Circle)s);
			}
		}
		System.out.println("Rectangles: \n" + rectangles);
		System.out.println("Triangles: \n" + triangles);
		System.out.println("Circles: \n" + circles);
	}
}
package GeoMetry;

public class Test {

	public static void main(String[] args) {
		Shape r1 = new Rectangle(1, 1, 2, 4);
		Shape c1 = new Circle (2, 2, 5);
		Shape t1 = new Triangle(3, 3, 2, 3, 4, 5);
		Group g = new Group();
		//Testfunktionen
		System.out.println(r1.calculateCircumference());
		System.out.println(r1.calculateArea());
		System.out.println(c1.calculateCircumference());
		System.out.println(c1.calculateArea());
		System.out.println(t1.calculateCircumference());
		System.out.println(t1.calculateArea());
		g.addShape(r1);
		g.addShape(c1);
		g.addShape(t1);
 
		System.out.println("Gesamtfl�che: " + g.calculateSumArea());
		System.out.println("Gesamtumfang: " + g.calculateSumCircumference());
		System.out.println("Gr��te Fl�che: " + g.returnGreatestAreaShape());
		g.returnGroupedShapes();
	}

}

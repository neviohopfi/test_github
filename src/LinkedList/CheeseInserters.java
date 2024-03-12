package LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;

public class CheeseInserters {
	
			// private -> Sichtbarkeitsbereich auf Klasse beschr�nkt
			// finale -> Variable kann danach nicht mehr ver�ndert werden
			// static -> abh�ngig von der Klasse und nicht vom Objekt
	private static final Pattern vegetables = Pattern.compile(
			"Zucchini|Paprikas?|Zwiebeln?|Tomaten?|Melanzani"
			);
	
	public static void insertCheeseAroundVegetable(List<String> ingredients) {
		// Initialisierung Laufvariable (iterator)
		// Abbruchbedingung (hasNext())
		// keine Inkrementierung -> passiert im Schleifenkopf
		for(ListIterator<String> iterator = ingredients.listIterator(); iterator.hasNext();) {
			String ingredient = iterator.next();
			// matcher -> wird verwendet, um ingredient in unserem Muster zu finden
			// matches() -> f�r den direkten Vergleich
			if(vegetables.matcher(ingredient).matches()) {
				iterator.add("K�se");
			}
			
		}
	}
	
	public static void main(String[] args) {
		List<String> ingredients = new LinkedList<String>();
					// addAll -> Kursiv, weil es eine static Methode ist
		Collections.addAll(ingredients, "Gnocchi", "Paprika", "Tomaten", "Pfeffer", "Melanzani");
		insertCheeseAroundVegetable(ingredients);
		System.out.println(ingredients);
		
	}
}
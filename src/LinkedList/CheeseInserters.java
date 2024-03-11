package LinkedList;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;

public class CheeseInserters {

	private static final Pattern vegetables = Pattern.compile(
			"Zucchini|Paprikas?|Zwiebeln?|Tomaten?"
			);
	
	public static void insertCheeseAroundVegetable(List<String> ingredients) {
		//Initialisierung Laufvariable (iterator)
		//Abbruchbedingung (hasNext())
		//keine Inkrementierung -> passiert im Schleifenkopf
		for(ListIterator<String> iterator = ingredients.listIterator(); iterator.hasNext();) {
			String ingredient = iterator.next();
		}
	}
	
	public static void main(String[] args) {
		
		
		
	}

}

package musicalChairs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class MusicalChair {

	private List<String>names;

	public MusicalChair(String... names) {
		// String... kann beliebig viele Strings �bernehmen
		// Java regelt das intern mit einem Array
		// dadurch wird length und nicht size verwendet!
		if(names.length > 0) {
			// Arrays.asList(names) - wandelt ein Array in eine Liste um
			this.names = new LinkedList<String>(Arrays.asList(names));
			
		}
	}
	
	
	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}	
	
	public String toString() {
		Iterator<String> itr = this.names.iterator();
		String tmp = "";
		while(itr.hasNext()) {
			tmp = tmp + itr.next() + ", ";
		}
		return tmp;
	}
	
	public void rotate(int distance) {
		Collections.rotate(this.names, distance);
		
	}
	
	public void rotateAndRemovelast(int distance){
		this.rotate(distance);
		((LinkedList<String>) this.names).removeLast();
	}
	
	public String play() {
		if(!this.names.isEmpty()) {
			while(this.names.size() > 1) {
				int randomNum = ThreadLocalRandom.current().nextInt();
				this.rotateAndRemovelast(randomNum);
				System.out.println(this.names);
			}
		}
		//optional
		return this.names.get(0);
	}
	
}
package musicalChairs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MusicalChair {

	private List<String>names;

	public MusicalChair(String... names) {
		// String... kann beliebig viele Strings übernehmen
		// Java regelt das intern mit einem Array
		// dadurch wird length und nicht size verwendet!
		if(names.length > 0) {
			this.names = new LinkedList<String>(Arrays.asList(names));
			
		}
	}
	
	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}	
}
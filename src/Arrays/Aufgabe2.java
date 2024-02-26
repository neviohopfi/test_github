package Arrays;

public class Aufgabe2 {

	public static boolean isProbablyApproaching(String[] signs) {
		if(signs.length == 0) {
			System.out.println("Array isch null");
			return false;
		}
		for(int i = 3; i < signs.length; i++) {
			if(signs[i].equals(signs[i-1])&& signs[i].equals(signs[i-2])&& signs[i].equals(signs[i-3])) {
				return true;			
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		String[]signs1 = {"F", "DO", "MOS", "MOS","MOS", "MOS", "WES"};
		System.out.println(isProbablyApproaching(signs1));	//true
		
		
		String[]signs2 = {"F", "DO", "MOS", "MOS", "WES", "MOS", "MOS"};
		System.out.println(isProbablyApproaching(signs2));	//false	
	}
	

}

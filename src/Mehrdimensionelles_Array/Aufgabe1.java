package Mehrdimensionelles_Array;

public class Aufgabe1 {
	
	public static int[][] magnify(int[][] array, int factor){
		int length = array.length;
		int width = array[0].length;
		
		int scale[][] = new int[length + factor][width * factor];
		
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < width; j++) {
				int a = 0;
				while(a < factor) {
					
				}
			}
		}
		return scale;
	}
	
	public static void main(String[] args) {
		
		int[][] array = {{1, 2, 3} , {4, 5, 6}};

	}

}

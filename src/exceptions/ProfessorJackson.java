package exceptions;

public class ProfessorJackson {

	public static double divide(int x, int y) {
		if (y>0) {
			return x / y;
		} else {
			throw new ArithmeticException();
		}
	}
	
	public static int checkFileExtension(String fileName) {
		if(fileName.endsWith(".java")) {
			return 1;
		} 
		try {
			if(fileName == null || fileName.isEmpty()) {
				throw new IllegalArgumentException();
			}
		} catch(IllegalArgumentsException e){
			return -1;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(divide(7, 0));
		} catch(ArithmeticException a) {
			System.out.println("No Division by zero");
		}
		}
	}

package exceptions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class SaveTime {
	
	public static void main(String args[]) throws FileNotFoundException {
		String file = "test.txt";
		
			try (PrintWriter pW = new PrintWriter(file)) {
				pW.print(LocalDateTime.now().toString());
			} catch(Exception e) {
			e.getStackTrace();
		}
	}
}

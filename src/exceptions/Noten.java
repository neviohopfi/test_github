package exceptions;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Noten {

	public void extractNotes() {
	}
	public static void main(String[] args) {
		Scanner sc;
		try {
			sc = new Scanner(Paths.get("file.txt"));
			while(sc.hasNextLine()) {
				System.out.print(sc.nextLine() + " ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

 
	}
 
}
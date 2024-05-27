package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Noten {
	private static final Pattern notes = Pattern.compile(
			"C,?|D,?|E,?|F,?|G,?|A,?|B,?|c'?|d'?|e'?|f'?|g'?|a'?|b'?"
			);
	public static void extractNotes() {
		Scanner sc;
		try {
			sc = new Scanner(Paths.get("file.txt.txt"));
			PrintWriter pw = new PrintWriter("file2.txt");
			pw.write("M : C\n");
			pw.write("L : 1/4\n");
			pw.write("K : C\n");
			while(sc.hasNextLine()) {
				String nextNote = sc.nextLine();
				if(notes.matcher(nextNote).matches()) {
					pw.write(nextNote + " ");
				}
			}
			sc.close();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		extractNotes();
	}
 
}
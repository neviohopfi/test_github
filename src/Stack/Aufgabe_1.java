package Stack;

import java.util.LinkedList;

public class Aufgabe_1 {

	public static String reverseString(String input) {
		LinkedList<Character> stack = new LinkedList<Character>(); //Character weil es eine Wrapper Klasse ist
		for(char c : input.toCharArray()){
		 	stack.push(c);
		 }
		 StringBuilder reversedString = new StringBuilder();
		 while(!stack.isEmpty()) {
			 reversedString.append(stack.pop());
		 }
		 return reversedString.toString();
	}		
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println(reverseString("Andi Arbeit"));
	}
}
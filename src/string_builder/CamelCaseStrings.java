package string_builder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CamelCaseStrings {

	public static String camelCaseSplitter(String str) {
		Pattern capitalLetters = Pattern.compile(".*[A-Z].*");
	
		StringBuilder ans = new StringBuilder();
		for(String s : str.split("")) {
			Matcher letterMatcher = capitalLetters.matcher(s);
			if(letterMatcher.matches() && ans.length() > 0) {
				ans.append(" ");
			}
			ans.append(s);
		}
		return ans.toString();
	}
	public static void main(String[] args) {
		System.out.println(camelCaseSplitter("HalloIchBinBrunoUndIchBinDerKameramann"));
	}

}

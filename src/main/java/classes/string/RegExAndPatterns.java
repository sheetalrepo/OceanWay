package classes.string;

import java.util.regex.Pattern;

public class RegExAndPatterns {

	
	public static void splitUsingPattern() {
		String str = "Hi|I|am| practicing | split|function";
		String[] strArray = str.split(Pattern.quote("|"));
		//String[] strArray = data.split("\\|");
		System.out.println(strArray.length);
		
		for(String s : strArray)
			System.out.print(s.trim()+" ");
	}
	
	public static void main(String[] args) {
		splitUsingPattern();
	}

}

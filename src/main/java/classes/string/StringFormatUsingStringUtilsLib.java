package classes.string;

import org.apache.commons.lang.StringUtils;

/**
 * Lot of string operations can be done using apache string utils class
 * 
 * For detailed list refer following link
 * https://commons.apache.org/proper/commons-lang/apidocs/org/apache/commons/lang3/StringUtils.html
 */
public class StringFormatUsingStringUtilsLib {

	public void repeatChar(){
		System.out.println("--------------------Repeat----------------------------");
		System.out.println("repeat: "+StringUtils.repeat("a", 3));
		System.out.println("repeat: "+StringUtils.repeat("no", 3));
		System.out.println("repeate space: ["+StringUtils.repeat(" ", 10) +"]");
		
		System.out.println("repeate space: >"+StringUtils.repeat(" ", 52) +"<");
		
		
	}

	public void repeatWithSeparator(){
		System.out.println("--------------------Repeat with Separator----------------------------");
		System.out.println("repeat: "+StringUtils.repeat("a",":", 3));
		System.out.println("repeate space: ["+StringUtils.repeat("1",", ", 10) +"]");
	}

	public void rightPad(){
		System.out.println("--------------------Right Pad----------------------------");
		System.out.println("right pad: ["+StringUtils.rightPad("bat", 3)+"]");
		System.out.println("right pad: ["+StringUtils.rightPad("bat", 1)+"]");
		System.out.println("right pad: ["+StringUtils.rightPad("bat", 5)+"]");
	}
	
	public void rightPadWithSeparator(){
		System.out.println("--------------------Right Pad With Separator (Char/String)----------------------------");
		System.out.println("right pad: ["+StringUtils.rightPad("cat", 3, '*')+"]");
		System.out.println("right pad: ["+StringUtils.rightPad("cat", 1, "$$")+"]");
		System.out.println("right pad: ["+StringUtils.rightPad("cat", 8, "$$")+"]");
	}
	
	public void leftPad(){
		System.out.println("--------------------Left Pad----------------------------");
		System.out.println("left pad: ["+StringUtils.leftPad("mat", 3)+"]");
		System.out.println("left pad: ["+StringUtils.leftPad("mat", 1)+"]");
		System.out.println("left pad: ["+StringUtils.leftPad("mat", 6)+"]");
	}
	
	public void leftPadWithSeparator(){
		System.out.println("--------------------Left Pad With Separator (Char/String)----------------------------");
		System.out.println("left pad: ["+StringUtils.leftPad("mat", 3, '*')+"]");
		System.out.println("left pad: ["+StringUtils.leftPad("mat", 1, '*')+"]");
		System.out.println("left pad: ["+StringUtils.leftPad("mat", 8, "na")+"]");
		System.out.println("left pad>>>: ["+StringUtils.leftPad("23", 20, '0')+"]");
	}
	
	//First character changes to upper case
	public void capitalize(){
		System.out.println("--------------------Capitalize----------------------------");
		System.out.println("Cap: "+StringUtils.capitalize("cat"));
		System.out.println("Cap: "+StringUtils.capitalize("Cat"));
		System.out.println("Cap: "+StringUtils.capitalize("cAt"));
	}
	
	
	public void countMatches(){
		System.out.println("--------------------Matches----------------------------");
		System.out.println("Matches: "+StringUtils.countMatches("abc abc abbbc", "ab"));
		System.out.println("Matches: "+StringUtils.countMatches("abc abc abbbc", "a"));
	}
	
	
	public void isAlpha(){
		System.out.println("--------------------is Alpha----------------------------");
		System.out.println("alpha: "+StringUtils.isAlpha("abc"));
		System.out.println("alpha: "+StringUtils.isAlpha("a b"));
		System.out.println("alpha: "+StringUtils.isAlpha("a1"));
	}
	
	public void isNumeric(){
		System.out.println("--------------------is Numeric----------------------------");
		System.out.println("num: "+StringUtils.isNumeric("123"));
		System.out.println("num: "+StringUtils.isNumeric("12 3"));
		System.out.println("num: "+StringUtils.isNumeric("1a"));
	}
	
	public void isAlphaNumeric(){
		System.out.println("--------------------is Alphanumeric----------------------------");
		System.out.println("alpha: "+StringUtils.isAlphanumeric("abc"));
		System.out.println("alpha: "+StringUtils.isAlphanumeric("a2b"));
		System.out.println("alpha: "+StringUtils.isAlphanumeric("a 1"));
	}
	
	//since 3.6 version
	public void filerDigits(){
		System.out.println("--------------------Filter Digits----------------------------");
//		System.out.println("Digits: "+ StringUtils.getDigits("(541) 754-3010")); //"5417543010"
	}
	
	public static void main(String[] args) {
		StringFormatUsingStringUtilsLib obj = new StringFormatUsingStringUtilsLib();
		obj.repeatChar();
		obj.repeatWithSeparator();
		obj.rightPad();
		obj.rightPadWithSeparator();
		obj.leftPad();
		obj.leftPadWithSeparator();
		obj.capitalize();
		obj.countMatches();
		obj.isAlpha();
		obj.isNumeric();
		obj.isAlphaNumeric();
		obj.filerDigits();
	}

}

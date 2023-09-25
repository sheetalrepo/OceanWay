package solutions;

import java.util.Arrays;
import java.util.List;

/**
 *  Problem Stmt: We need to test multiple condition and assert shd failed even if one condition fails
 *
 */
public class AssertOnMultipleConditions {

	static boolean isAllCasesPassed;
	static boolean isAnyCaseFailed;
	
	public static boolean failCaseIfAnyOneConditionFailed(){
		boolean result;
		String [] arr = {"Arrow","apple","Ape","Box","Aries"};
		List<String> ls = Arrays.asList(arr);
			
		for(String words : ls ){
			
			if(words.startsWith("A") || words.startsWith("a")){
				System.out.println("Current Passed Word: "+ words);
			}else{
				System.out.println("Current Failed Word: "+ words);
				isAnyCaseFailed= true;
			}
		}
		
		result = check();
		return result;
	}
	
	
	public static boolean check(){
        isAllCasesPassed = !isAnyCaseFailed;
		return isAllCasesPassed;
	}
	
	
	public static void main(String [] args){
		boolean value = failCaseIfAnyOneConditionFailed();
		System.out.println("Test Case(Assert True): "+ value);
	}
	
	
}
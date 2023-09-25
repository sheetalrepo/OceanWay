package classes.general;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * 
 * Apache utility very helpful in generating random alpha numeric value
 * 
 */
public class RandomValue {

	public static void main(String[] args) {
    	System.out.println(RandomStringUtils.random(4, true, false));   // length, letters, numbers
    	System.out.println(RandomStringUtils.random(4, false, true));
    	System.out.println(RandomStringUtils.random(4, true, true));
    	System.out.println(RandomStringUtils.random(4, false, false));
	}

}

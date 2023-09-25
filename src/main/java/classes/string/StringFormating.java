package classes.string;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * For any formatting try to use apache's StringUtils library
 */
public class StringFormating {

	private static final Logger logger = LoggerFactory
			.getLogger(StringFormating.class);
	
	/**
	 * #types:
	 * public static String format(Locale loc, String form, Object args)
	 * public static String format(String form, Object� args)
	 * 
	 * 
	 */
	
	
	public static void stringDotFormat(){
		
		
		//simple case
		String s1 = String.format("Hello my name is %s and my age is %d","John", 33);
		logger.info(s1);
		System.out.println(String.format("Hello my name is %s and my age is %d","John", 33));
		
		
		//decimal round off 
		String s2 = String.format("Round off till 4 decimal places:  %.4f", 47.65735); //47.6574
        System.out.println(s2);
		String s3 = String.format("Round off till 8 decimal places:  %.8f", 47.65735); //47.65740000
        System.out.println(s3);
        
        
        /**
         * x.y : x decides alignment and space allocation , y decides decimal places and round off rules
         * 15 spaces allocated to complete variable 
         * 8 is for decimal places
         * +ve is right aligned
         * -ve is left aligned
         */
        String s4 = String.format("My answer is [%15.8f]", 47.65734); 
        System.out.println(s4);
        String s5 = String.format("My answer is [%-15.8f]", 47.65734); 
        System.out.println(s5);
		
        
        /**
         * Concatenation using +
         * %x$y : x decides argument count to be picked up
         * 		: y decides argument type i.e. d,s etc	
         * 
         * 
         */
        String one = "one"; 
        String two = "two";
        String three = "three";
        int four = 4;
  
        String testSequence1 = String.format("%1$s, %2$s, %3$s and %4$d", one, two, three, four);
        String testSequence2 = String.format("%1$s, %3$s and %4$d", one, two, three, four);
        String testSequence3 = String.format("%4$d and %1$s", one, two, three, four);
        System.out.println(testSequence1); 
        System.out.println(testSequence2);
        System.out.println(testSequence3);
		
        
        /**
         * padding
         * default padding is with 'space' or 0 in case of int
         * for other char we can use replace method
         * 
         * for string 's' will come instead of 'd'
         */
        int num = 1234;
        String padding1 = String.format("%8d", num); 						//    1234
        String padding2 = String.format("%08d", num); 						//00001234									
        String padding3 = String.format("%8d", num).replace(' ', '*');      //****1234
        String padding4 = String.format("%-8d", num).replace(' ', '*');     //1234****
        System.out.println(padding1); 
        System.out.println(padding2);
        System.out.println(padding3);
        System.out.println(padding4);
  
	}
	

	
	/**
	 * For formatting related thing better to use Apache's StringUtils Library
	 */
	public static void sysOutDotPrintf(){
		//integer
		System.out.printf("Cost of one apple is Rs:%d, for dozens it will be Rs:%d",10,120);
		

		/**
		 * +ve number is for right alignment
		 * digit indicates space to be allocated to numbers
		 */
		System.out.println("");
		System.out.println("----------------------------%2d-----------------------------------");
		for(int i=5; i <= 15; i++){
			System.out.printf("%2d: student names\n", i);
		}
		

		/**
		 * -ve number is for left alignment
		 * digit indicates space to be allocated to numbers
		 */
		System.out.println("-----------------------------%-2d----------------------------------");
		for(int i=5; i <=15; i++){
			System.out.printf("%-2d: student names\n", i);
		}
	
		
		
		/**
		 * %f for floating points
		 * .2 round off value till 2 decimal places
		 */
		System.out.println("-----------------------------%.2f----------------------------------");
		System.out.printf("Total value is %.2f",12.2255449);   // Total value is 12.23
		System.out.println("");
		
		
			
		// right align by 10 digit
		System.out.println("---------------------------------------------------------------");
		System.out.printf("Total cost:%10.2f Rs", 20.12567767);  // Total cost:     20.13 Rs          
		System.out.println("");
		
		
		// left align by 10 digit
		System.out.println("---------------------------------------------------------------");
		System.out.printf("Total cost:%-10.2f Rs", 20.12567767);  // Total cost:20.13      Rs          
		
	
	}
	
	
	public static void otherGeneralFormatings(){
		// tab
		System.out.println("I am cop \t and i am on my duty");  // I am cop	  and i am on my duty
	}
	

	
	public static void stringDotFormat2() {
		System.out.println("Int| Fixed Width | Filled with given 0 | right aligned    >"+ String.format("%04d",12)+"<");  
		System.out.println("Int| Fixed Width | Filled with given space | right aligned    >"+ String.format("% 4d",12)+"<");
		
		
		System.out.println("String| Fixed Width | Filled with default space | left aligned    >"+ String.format("%-8s","abc")+"<"); // -ve left aligned
		System.out.println("String| Fixed Width | Filled with default space | right aligned    >"+ String.format("%8s","abc")+"<"); // +ve right aligned
		System.out.println("String| Fixed Width | Filled with default space   >"+ String.format("%-8s","")+"<"); // -ve left aligned		
		System.out.println("String| Fixed Width | Filled with default space   >"+ String.format("%-8s","  cd  ")+"<"); // -ve left aligned		
	}
	   
	

	public static void main(String [] args){
		//stringDotFormat();
		stringDotFormat2();
		//sysOutDotPrintf();
		//otherGeneralFormatings();
	}

}

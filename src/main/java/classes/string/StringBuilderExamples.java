package classes.string;

/**
 * String Builder is not thread safe
 * String Buffer is thread safe i.e. synchronize and also obsolete now
 * Both are more efficient in handling String as both are mutable
 * Use these when we have to do lot of operation with strings as they are memory efficient and hence faster
 */

public class StringBuilderExamples {


	public static void main(String [] args){
			
		StringBuilder sb = new StringBuilder();
		sb.append("Hi my name is bob");
		sb.append(" ");
		sb.append(", i am a skydiver")
		.append(" ")
		.append(", clounds are rainy today");
		
		System.out.println(sb);  // Hi my name is bob , i am a skydiver , clounds are rainy today
	
		
	}

}

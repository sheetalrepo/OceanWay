package java8.optional;

import java.util.Optional;

public class OptionalEg2 {

	/**
	 *  Optional.ofNullable usage
	 */
	public void sample1() {
		//Code 1 : Throw NPE
		String[] strArr = new String[10];
		//System.out.println(strArr[5].toLowerCase());   //Throw NPE
		
		//Code 2
		//Optional<String> str = Optional.of(strArr[5]);   //Throw NPE

		//Code 3
		Optional<String> str = Optional.ofNullable(strArr[5]);
		if(str.isPresent()){
			System.out.println(strArr[5].toLowerCase());    //style 1
			System.out.println(str.get());
		}else{
			System.out.println("Value not present");
		}
	}


	/**
	 * Optional.empty usage
	 */
	public void sample2(){
		// It returns an empty instance of Optional class
		Optional<String> empty = Optional.empty();
		System.out.println(empty);   // Optional.empty
	}


	/**
	 * ifPresent usage
	 *
	 * above if else loop can be replaced by 'if' rather using 'is'
	 */
	public void sample3() {
		String[] strArr = new String[10];
		strArr[5] = "Ocean";
		
		Optional<String> opt = Optional.ofNullable(strArr[5]);

		opt.ifPresent(System.out::println);
		System.out.println(opt.get());
			
	}
		
	
	
	
	/**
	 * filters usage
	 */
	public void sample4() {
		String[] strArr = new String[10];
		strArr[1] = "XYZ";
		strArr[5] = "CLOUD";
		
		// If value is present, it returns an Optional otherwise returns an empty Optional  
		Optional<String> opt = Optional.ofNullable(strArr[5]);
		System.out.println("Filtered value: "+opt.filter(x -> x.equals("Abc")));
		System.out.println("Filtered value: "+opt.filter(x -> x.equals("CLOUD")).get());
				
	}
	
	
	/**
	 * orElse usage
	 * kind of ternary operator
	 */
	public void sample5() {
		String[] str = new String[10];        
		str[5] = "Sky";

		// It returns value if available, otherwise returns specified value,  
		Optional<String> opt1 = Optional.ofNullable(str[5]); 
		System.out.println("Usage of orElse: "+opt1.orElse("Value is not present"));
		
		Optional<String> opt2 = Optional.ofNullable(str[6]); 
		System.out.println("Usage of orElse: "+opt2.orElse("Value is not present"));
		
	}
	

	

	
	public static void main(String[] args) {
		OptionalEg2 obj = new OptionalEg2();
		//obj.sample1();
		//obj.sample2();
		//obj.sample3();
		obj.sample4();
		//obj.sample5();
	}
}

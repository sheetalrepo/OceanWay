package java8.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Lambadas with lists
 * 
 * https://www.mkyong.com/java8/java-8-streams-filter-examples/
 * 
 * 
 *  Initial list -> 
 *  	convert to stream(seq/parallel) -> 
 *  		filter using some condition 	-> 
 *  			collect result using Collectors class  
 *  
 *    filter is simply to filter out results and return true/false
 *    map is to transform the result into something new
 */
public class FilterListUsingStream {

	public void beforeJava8() {
		List<String> ls = Arrays.asList("malaga","marbaella","nirja","delhi","pune");
		List<String> filteredList = new ArrayList<>();
		
		for(String str : ls) {
			if(str.length() < 6)
				filteredList.add(str);
		}
		System.out.println(">>> Filtered List Before Java8: "+ filteredList);
	}
	
	
	/**
	 * Get all names who's length is less than 6
	 * 
	 * class: java.util.stream.Collectors
	 */
	public void filterStringListWithStreams() {
		List<String> ls = Arrays.asList("agra","bollywood","chennai","delhi","egypt");
		List<String> filteredList = ls.stream()
									.filter(x -> x.length() < 6 )
									.collect(Collectors.toList());	
		
		System.out.println(">>> Filtered List With Lambadas: "+ filteredList);
	}
	
	
	
	public void filterPersonListWithStreams() {
		List<Person> ls = new ArrayList<Person>();	
		ls.add(new Person("Sachin", "Tendulkar", 25));
		ls.add(new Person("Adam", "Gilchrist", 35));
		
		List<Person> newYoungerBatch = ls.stream()
				.filter(person ->  person.getAge() <= 30)
				.collect(Collectors.toList());
		System.out.println("### Younger Batch: "+newYoungerBatch);
	}
	
	
	
	/**
	 * Usage of findAny() & else
	 */
	public void findAnyExamples() {
		System.out.println("\n************************************************");
		
		List<Person> ls = new ArrayList<Person>();	
		ls.add(new Person("Adam", "Gilchrist", 35));
		ls.add(new Person("sachin", "Lara", 24));
		ls.add(new Person("Edson", "Pele", 35));
		ls.add(new Person("Sachin", "Tendulkar", 25));
		System.out.println("Find Any Complete Team: "+ls);

		/**
		 *  Return only first matched result
		 *  If nothing matched then null will be returned
		 */
		Person person = ls.stream()
				.filter(x -> x.getFirstname().equalsIgnoreCase("sachin"))
				.findAny()
				.orElse(null);
		
		System.out.println("Find Any result: " + person);
		
	}	
	
	
	/**
	 * filter is simply to filter out results and return true/false
	 * map is to transform the result into something new
	 */
	public void findAnyWithMapExamples() {
		System.out.println("\n************************************************");
		List<Person> ls = new ArrayList<Person>();	
		ls.add(new Person("Adam", "Gilchrist", 35));
		ls.add(new Person("sachin", "Lara", 24));
		ls.add(new Person("Edson", "Pele", 35));
		ls.add(new Person("Sachin", "Tendulkar", 25));
		System.out.println("Find Any Complete Team: "+ls);
		
		/**
		 * map(return value) : this method decide what to return
		 * 
		 * Here x is Person
		 * in Map, we transformed Person into getLastName
		 * Next line, findAny or Collector will decide what to return 
		 */
		String sachin2 = ls.stream()
						.filter(x -> x.getFirstname().startsWith("Sachin"))
						.map(Person::getLastname)
						.findAny()
						.orElse("");

		
		List<String> surnames = ls.stream()
				.filter(x -> x.getFirstname().length() > 5)
				.map(Person::getLastname)
				.collect(Collectors.toList());

		System.out.println("Find Any using Maps: " + sachin2);
		System.out.println("Collectors using Maps: " + surnames);
	
		
		

		
		
		/**
		 * Java8: To get specific object with curly braces usage
		 *  
		 * Curly used when code is more than one row
		 * Here we return boolean, but in actual we get object of Person 
		 */
		Person gill = ls.stream()
						.filter(x ->  {
                            return x.getFirstname().equalsIgnoreCase("adam");
                        })
						.findAny()
						.orElse(null);
				
		System.out.println("\n\nGet Specific Full Object using {} : " + gill);
				

		
		
		
		/**
		 * Java8 : to get list of object's value 
		 * 
		 * If we want to fetch all lastName from a List of Person. 
		 */
		List<String> allLastName = ls.stream()
								.map(Person::getLastname)
								.collect(Collectors.toList());
								
		System.out.println("Fetching all values only from objects list: "+ allLastName);
	}
	
	
	/**
	 * List<Header>  -->  subsetof List<Header>
	 * List<Header>  -->  List<String>
	 * 
	 * Header contains key and values separated by :
	 * SetCookies : AccessToken=abc,Max=0,Http=true 
	 */
	public void convertAndFilterList() {
//		List<Header> headersList = bigHeaderList.stream()
//                .filter(x -> x.getName().equals("Set-Cookie"))
//                .collect(Collectors.toList());
//        List<String> headerValues = Lists.transform(headersList, x -> x.getValue());
//        log.info("Filtered Header List: {}", headersList);
      
	}
	
	
	public static void main(String [] args) {
		FilterListUsingStream obj = new FilterListUsingStream();
		//obj.beforeJava8();
		//obj.filterStringListWithStreams();
		//obj.filterPersonListWithStreams();
		//obj.findAnyExamples();
		obj.findAnyWithMapExamples();
		
		//obj.convertAndFilterList();
	}
}

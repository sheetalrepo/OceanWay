//package solutions.multipleassert;
//
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.equalTo;
//import static org.hamcrest.Matchers.greaterThan;
//import static solutions.multipleassert.BeanPropertyMatcher.*;
//import static solutions.multipleassert.BeanMatcher.*;
//
//
///*
// * 
// * 
// * https://dzone.com/articles/testing-multiple-properties
// */
//public class AssertMultipleValuesOfObject {
//
//	
//	public static void basicAssertion() {
//		PersonBasic person = new PersonBasic();
//		person.setFirstName("Albert");
//		person.setLastName("Kart");
//		person.setAge(34);
//		
//		assertThat(person, has(
//                property("firstName", equalTo("Albert")), 
//                property("age", greaterThan(30)), 
//                property("lastName", equalTo("Kart"))));
//		
//		System.out.println("Assertion Successfull");
//	}
//	
//	
//	
//	
//	public static void main(String[] args) {
//		basicAssertion();	
//	}
//
//}

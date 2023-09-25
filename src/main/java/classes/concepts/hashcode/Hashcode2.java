package classes.concepts.hashcode;

/**
 * As a user I want a behavior that if two reference are from same class. then
 * Java should give same hashcode, I want it that way
 * 
 * Then in that case we have to change default hashCode() behavior
 *
 */
public class Hashcode2 extends Object {

	
	/**
	 * We have overridded hash code
	 */
	@Override
	public int hashCode(){
		return 100;
	}
	
	
	public static void main(String [] args){
		Hashcode2 obj1 = new Hashcode2();
		Hashcode2 obj2 = new Hashcode2();

		//Just to get original hashcode
		System.out.println(System.identityHashCode(obj1));  // 366712642
		System.out.println(System.identityHashCode(obj2));  // 1829164700
		

		//hashcode has been overridden and now they are same
		System.out.println(obj1.hashCode());  // 100
		System.out.println(obj2.hashCode());  // 100
		
		//But obj still different in terms of equals, hence we need to override equals also; see nxt example
		System.out.println(obj1.equals(obj2)); //false
		
		//Reference check : In ref check original hashcode value will be compared
		//Else loop will get execute
		if(obj1 == obj2)
			System.out.println("True: References, points to same location on heap");
		else
			System.out.println("False: References, points to different location on heap");
			
		
	}
}

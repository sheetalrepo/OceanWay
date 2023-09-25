package classes.concepts.hashcode;

import java.util.Objects;

/**
 * Always override both hashcode and equals to compare two objects
 */
public class Hashcode3 {
	
	public String name;

	//auto generated hashcode 
//	@Override
//	public int hashCode() {
//		System.out.println("<Inside hashcode>");
//		final int prime = 31;
//		int result = 17;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}
	
	
	//from jdk 7.0 we can also use following hashcode
	@Override
    public int hashCode() {
		System.out.println("<Inside hashcode 7>");
        return Objects.hash(name);
    }

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			System.out.println("will not print:  print if obj references are same");
			return true;
		}
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Hashcode3 other = (Hashcode3) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		
		return true;
	}




	public static void main(String[] args) {
		
		Hashcode3 obj1 = new Hashcode3();
		obj1.name="abc";
		Hashcode3 obj2 = new Hashcode3();
		obj2.name="abc";
		
		System.out.println(obj1.hashCode()); 
		System.out.println(obj2.hashCode()); 
		
		if(obj1.equals(obj2)){
			System.out.println("Objs are same");
		}else{
			System.out.println("Objs are not same");
		}
		
		//Reference check : ref always check for original code which will be diff
		if(obj1 == obj2)
			System.out.println("True: References, points to same location on heap");
		else
			System.out.println("False: References, points to different location on heap");
		
		
		System.out.println("Orig HC: "+System.identityHashCode(obj1));  
		System.out.println("Orig HC: "+System.identityHashCode(obj2));
		
	}

}

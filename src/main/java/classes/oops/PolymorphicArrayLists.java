package classes.oops;

import java.util.ArrayList;
import java.util.List;

/**
 * Polymorphic Array List
 * 
 * 1. Compiler stop us to use polymorphism in AL i.e. no question abt Runtime exception	
 * 2. So in case of Array List, List<Dog> cant be passed into List<Animal>
 * 3. Arrays: Dog[] can be passed into Animal []
 * 
 * Lets see how to solve this problem using Wild Card in next example
 */
class BigAnimal{
	public void eat(){
		System.out.println("BigAnimal eating");
	}
}

class BigDog extends BigAnimal{
	public void bark(){}
	
	@Override
	public void eat(){
		System.out.println("BigDog eating");
	}
}

class BigCat extends BigAnimal{
	public void meow(){}
	
	@Override
	public void eat(){
		System.out.println("BigCat eating");
	}
}

public class PolymorphicArrayLists {

	/**
	 * Polymorphic method for ArrayList
	 * It will except only Animal type, no Dog type, no Cat type array list .... no polymorphism
	 */
	public void setAnimals(List<BigAnimal> list){
		
		//list.add(new BigCat()); //added a cat to the list 
		
		for(BigAnimal a: list){
			a.eat();
		}
		
	}
	
	
	public static void main(String [] args){
		PolymorphicArrayLists obj = new PolymorphicArrayLists();
		
		//Animal array list - can contains any animal and its sub type
		List<BigAnimal> ls1 = new ArrayList<>();
		ls1.add(new BigAnimal());
		ls1.add(new BigDog());
		ls1.add(new BigCat());
		obj.setAnimals(ls1);
		

		//Dog array list - can contains only dog type
		List<BigDog> ls2 = new ArrayList<>();
		ls2.add(new BigDog());
		ls2.add(new BigDog());
		ls2.add(new BigDog());
		//obj.goodBigAnimal(ls2);  // compiler error 
		
		//java stopped developer at compiler time else we may get runtime exception if someone added "list.add(new BigCat())" in method (line 46)
	}
	
}

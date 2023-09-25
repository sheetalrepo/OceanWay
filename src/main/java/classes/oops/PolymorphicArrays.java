package classes.oops;

/**
 * Polymorphic arrays
 * In Arrays we can pass Dog array into Animal array
 * Compiler will not object to it
 * But we may get Runtime exception if we try to add Cat into Dog
 * Runtime JVM saved us at least
 * 
 * Lets see same scenarios with Array Lists
 */
class Animal{
	public void eat(){
		System.out.println("Animal eating");
	}
}

class Dog extends Animal{
	public void bark(){}
}

class Cat extends Animal{
	public void meow(){}
}

public class PolymorphicArrays {

	/**
	 * Polymorphic method for Arrays
	 * It can take all sub type of Animal as arguments
	 */
	public void goodAnimal(Animal[] animal){
		
		for(Animal a: animal){
			a.eat();
		}
	}
	
	
	/**
	 * Here we are passing Dog object from main method
	 * No compile time error because argument is of type Animal
	 * and Compiler thought its ok to add Cat, Animal into a Animal
	 * But at runtime we passed a Dog array
	 */
	public void badAnimal(Animal [] animal){
		//updating current array with new elements
		animal[0] = new Dog();
		animal[1] = new Cat();  // Adding a Cat into Dog array
		animal[2] = new Animal(); // Adding Parent Animal object into Child Dog array
		
		for(Animal a: animal){
			a.eat();
		}
	}
	
	public static void main(String [] args){
		PolymorphicArrays obj = new PolymorphicArrays();
	
		Animal [] a = {new Animal(), new Animal(), new Animal()};
		Dog [] d = {new Dog(), new Dog(), new Dog()};
		
		obj.goodAnimal(a);
		obj.goodAnimal(d);
		
		obj.badAnimal(a); // fine
		obj.badAnimal(d); // run time exception ArrayStoreException
		
	}
	
}

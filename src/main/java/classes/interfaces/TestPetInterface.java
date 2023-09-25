package classes.interfaces;

public class TestPetInterface {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		System.out.println("What dog eats: "+dog.whatMyPetEats());

		RoboDog robodog = new RoboDog();
		System.out.println("What robo dog eats: "+robodog.whatMyPetEats());
	}

}

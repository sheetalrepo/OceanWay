package classes.interfaces;

/**
 * Two classes from completely different hierarchy can be passed to same method
 * as argument or return type. So in interface we focus on role to play rather
 * class. Pet is a role, pet can be anyone - machine, animal or alien (really -
 * do they exists)
 */

public class Dog implements Pet {

	Pet p;
	static RoboDog rd = new RoboDog(); // Composition eg

	@Override
	public String whatMyPetEats() {
		return "Bone";
	}

	/**
	 * I am a polymorphic method, can take anything which is a Pet
	 */
	public void setPet(Pet p) {
		System.out.println(p.toString());
	}

	/**
	 * I am returning a Pet, anyone who is pet can take values from me but please
	 * cast to you type
	 */
	public Pet getPet() {
		return p;
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		d.setPet(d);
		d = (Dog) d.getPet();

		Dog d2 = new Dog();
		d2.setPet(rd);
		rd = (RoboDog) d2.getPet();
	}

	@Override
	public String toString() {
		return "simple dog class : " + this.getClass();
	}

}

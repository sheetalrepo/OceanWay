package classes.interfaces;

public class RoboDog implements Pet {

	@Override
	public String toString() {
		return "robo machine dog : " + this.getClass();
	}

	@Override
	public String whatMyPetEats() {
		return "Electric Charge";
	}

}

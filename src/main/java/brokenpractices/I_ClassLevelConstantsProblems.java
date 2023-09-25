package brokenpractices;

public class I_ClassLevelConstantsProblems {

	String carType;

	public void someLogicalMethod() {
		if (carType.equalsIgnoreCase("C")) {
			// classic car logic
		} else if (carType.equalsIgnoreCase("S")) {
			// standard car logic
		} else {
			// default logic
		}
	}

}

package brokenpractices;

public class I_ClassLevelConstantsSolution {

	String carType;
	private static final String CLASSIC_CAR_ABBREVIATION = "C";
    private static final String STANDARD_CAR_ABBREVIATION = "S";

	public void someLogicalMethod() {
		if (carType.equalsIgnoreCase(CLASSIC_CAR_ABBREVIATION)) {
			// classic car logic
		} else if (carType.equalsIgnoreCase(STANDARD_CAR_ABBREVIATION)) {
			// standard car logic
		} else {
			// default logic
		}
	}

}

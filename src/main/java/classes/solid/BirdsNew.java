package classes.solid;

/**
 * As per Liscov Substitution
 * 
 * @author Sheetal_Singh
 */
class BirdsNew {
	public void eat() {
	}
}

class FlightBirdsNew extends BirdsNew {
	public void fly() {
	}
}

class NonFlight extends BirdsNew {
}

class CrowNew extends FlightBirdsNew {
}

class OstrichNew extends NonFlight {

}

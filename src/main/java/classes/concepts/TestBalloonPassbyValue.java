package classes.concepts;


/**
 * Pass By Value: 
 * 1. A separate copy has been passed to method which also points to same mem locations
 * 2. If setter are called then val get updated
 * 3. If simply new ref updated to new mem loc then original ref will not change
 */
public class TestBalloonPassbyValue {

	/**
	 * o1, o2 are just copy of original objects red, blue pointing to same memory location
	 * o1 and o2 has been swapped but red, blue remain same
	 * after swap red,o2 points to mem loc 50 which is RED
	 */
	public static void swap(Object o1, Object o2) {      // o1 (60) ---------> RED ,   o2 (110) ----------> BLUE
		Object temp = o1;
		o1 = o2;
		o2 = temp;     // o1 (110)  -----------> BLUE       o2 (60)  ------------->  RED
	}
	
	
	
	/**
	 * line 1: b and blue both points to mem loc 100 and hence both are BLUE
	 * line 2: using b we called setColor method and hence mem loc 100 now updated to Apple
	 * line 3: now b points to mem loc 200 which is diff from previous values and 200 points to Green
	 * b which points to 200 called setColor which will have no impact on Apple which is place at 100 
	 */
	private static void foo(Balloon b) { // b=100
		b.setColor("Apple"); // baloon=100
		b = new Balloon("Green"); // baloon=200
		b.setColor("Mango"); // baloon = 200
	}

	
	
	
	public static void main(String[] args) {

		Balloon red = new Balloon("RED"); // memory reference 50          red(50) ------> RED
		Balloon blue = new Balloon("BLUE"); // memory reference 100      blue(100) --------> BLUE

		//Swap and Print
		swap(red, blue);
		System.out.println("Java is PASS By VALUE");
		System.out.println("red color=" + red.getColor());
		System.out.println("blue color=" + blue.getColor());

		
		// Try 2
		foo(blue);
		System.out.println("blue color=" + blue.getColor());

	}

	
	
	

}

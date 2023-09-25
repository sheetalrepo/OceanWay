package classes.enums;

/**
 * Basic enum with plain constants
 */
enum Directions {
	NORTH, SOUTH, EAST, WEST // all values are implicitly public static
}

public class EnumBasicConstants {

	public static void main(String[] args) {

		// Key and value will be same in enum if not specified
		Directions dr = Directions.valueOf("NORTH");
		System.out.println(dr);
		System.out.println(dr.name());
		System.out.println(dr.ordinal());
		System.out.println("");

		// Iterating on enum constants
		Directions[] obj = Directions.values();
		for (Directions d : obj) {
			System.out.println(d + ", index:" + d.ordinal());
		}

	}
}

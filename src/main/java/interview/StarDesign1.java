package interview;

/**
 * 
 * For 1st and 4th quadrant i.e. right side of y axis 
 * - total 2 for loop req
 * - first for loop start with count of star present in first row
 * - second for loop (j) depend on first loop values (i)
 *
 */


public class StarDesign1 {

	public void type1() {
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	
//	* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * * 
	
	
	
	public void type2() {
		for (int i = 5; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

//	* * * * * 
//	* * * * 
//	* * * 
//	* * 
//	* 
	
	public static void main(String[] args) {
		StarDesign1 obj = new StarDesign1();
		//obj.type1();
		System.out.println("---------------------------");
		obj.type2();
	}

}

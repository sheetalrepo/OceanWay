package interview;


/**
 * 
 * For 2nd and 3rd quadrant i.e. left side of y axis 
 * - total 3 for loop req
 * - first for loop always start with 1
 * - second for loop (j) need to print space
 * - third for loop (k) will print stars
 */


public class StarDesign2 {

	public void typeA() {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= (5 - i); j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

//     	 *
//	    **
//	   ***
//	  ****
//	 *****	
	
	
	
	public void typeB1() {
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}

			for (int k = 6; k > i; k--) {
				System.out.print("*");
			}

			System.out.println("");
		}
	}
	

//	*****
//	 ****
//	  ***
//	   **
//	    *
	
	public void typeB2() {
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= 6-i; k++) {
				System.out.print("*");
			}

			System.out.println("");
		}
	}

//	*****
//	 ****
//	  ***
//	   **
//	    *
	
	

	
	
	public static void main(String [] args){
		StarDesign2 obj=new StarDesign2();
		obj.typeA();
		//obj.typeB1();
		//obj.typeB2();
		
	}
}

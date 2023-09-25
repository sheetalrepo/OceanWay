package classes.controlstmt;

/**
 * break loop will break the flow of for/while loop and control go to next statement written after loops
 */
public class Break {

	public void breakForLoop() {
		for (int i = 0; i < 100; i++) {
			System.out.print(i + "	");   //0	1	2	3	4	5
			if (i == 5) {
				break;   // it will break for loop completely
			}
		}
	}

	
	public void breakWhileLoop() {
		int i = 0;
		System.out.println("");
		while (i < 100) {
			System.out.print(i + "	");  //0	1	2	3	4	5
			if (i == 5) {
				break;   // it will break while loop completely
			}
			i++;
		}
	}

	public static void main(String[] args) {
		Break obj = new Break();
		obj.breakForLoop();
		obj.breakWhileLoop();
	}
}

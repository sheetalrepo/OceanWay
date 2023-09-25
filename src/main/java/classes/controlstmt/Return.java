package classes.controlstmt;

/*
 * return also break the loop
 * return take control back to calling method line
 */
public class Return {

	public void abc() {
		System.out.println("i am abc start");
		xyz();
		System.out.println("");
		System.out.print("i am abc end");
	}

	public void xyz() {
		for (int i = 0; i < 100; i++) {
			System.out.print(i + "	"); // 0 1 2 3 4 5
			if (i == 5) {
				return;
			}
		}
	}

	public static void main(String[] args) {
		Return obj = new Return();
		obj.abc();
	}
}


/*
i am abc start
0	1	2	3	4	5	
i am abc end
*/
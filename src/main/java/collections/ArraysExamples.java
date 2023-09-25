package collections;


/**
 * 
 *  Diff between Arrays and ArrayList
 *  http://www.java67.com/2012/12/difference-between-array-vs-arraylist-java.html
 */
public class ArraysExamples {

	//Initializing Type 1
	public void oneDimArray1() {
		int[] arr; // declared array
		arr = new int[5]; // allocate physical memory with initial value as 0 in all slots
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		int res = 0;
		for(int i: arr){
			res=res + i;
		}
		System.out.println("avg:" + res / 5); // avg:30
	}

	//Initializing Type 2 : declared array and initialize it with data on the spot
	public void oneDimArray2() {
		int[] arr = { 10, 20, 30, 40, 50 }; //note there is no 'new' keyword used 
		int res = 0;
		for (int i = 0; i < arr.length; i++)
			res = res + arr[i];
		System.out.println("avg:" + res / 5); // avg:30
	}
	
	
	public void oneDimArray3(){
		String [] arr1={"0","1","2"};
		String [] arr2=new String[3];
		arr2[0]="a";
		arr2[2]="c";
		
		for(int i=0; i<arr1.length; i++){
			System.out.print(arr1[i]+" and "+arr2[i]+",   "); // 0 and a,   1 and null,   2 and c
		}
		 
		System.out.println("");
	}
	
	

	public void multiDim2DArray1() {
		int[][] mult = new int[3][5]; // [row][column]
		int val = 1;
		
		System.out.println(mult.length); // 3
		System.out.println(mult[0].length); // 5
		
		
		// allocate val to 2-D array
		for (int row = 0; row < mult.length; row++) {
			for (int col = 0; col < mult[row].length; col++) {
				mult[row][col] = val;
				val++;
			}
		}

		for (int row = 0; row < mult.length; row++) {
			for (int col = 0; col < mult[row].length; col++) {
				System.out.print(mult[row][col] + "	");
			}
			System.out.println("");
		}
	}
/*	o/p
  	1	2	3	4	5	
	6	7	8	9	10	
	11	12	13	14	15
*/
	

	public void multiDim2DArray2() {
		int[][] mult = new int[3][]; // [row][column not defined]

		// define column now of different size
		mult[0] = new int[2];
		mult[1] = new int[5];
		mult[2] = new int[1];

		System.out.println(mult[0].length); // 2
		System.out.println(mult[1].length); // 5
		System.out.println(mult[2].length); // 1
		
		int val = 1;
		// allocate val to 2-D array
		for (int row = 0; row < mult.length; row++) {
			for (int col = 0; col < mult[row].length; col++) {
				mult[row][col] = val;
				val++;
			}
		}
		
		System.out.println("");
		for (int row = 0; row < mult.length; row++) {
			for (int col = 0; col < mult[row].length; col++) {
				System.out.print(mult[row][col] + "	");
			}
			System.out.println("");
		}
	}

/*	o/p
	1	2	
	3	4	5	6	7	
	8	
*/
	
	public void multiDim2DArray3() {
		int[][] mult = { { 1, 2, 3, 4 }, { 10, 20, 30, 40 },
				{ 100, 200, 300, 400 } }; // [3][4]
		System.out.println("");
		for (int row = 0; row <= 2; row++) {
			for (int col = 0; col <= 3; col++) {
				System.out.print(mult[row][col] + "	");
			}
			System.out.println("");
		}
	}

/*	o/p
	1	2	3	4	
	10	20	30	40	
	100	200	300	400	
*/
	
	public void multiDim3DArray1() {
		int[][][] mult = new int[4][2][7]; // [set][set-row][set-column]
		int val = 1;

		for (int set = 0; set < 4; set++) {
			for (int row = 0; row < 2; row++) {
				for (int col = 0; col < 7; col++) {
					mult[set][row][col] = val;
					val++;
				}
			}
		}
		System.out.println("");
		for (int set = 0; set < 4; set++) {
			for (int row = 0; row < 2; row++) {
				for (int col = 0; col < 7; col++) {
					System.out.print(mult[set][row][col] + "	");
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		ArraysExamples obj = new ArraysExamples();
		obj.oneDimArray1();
		obj.oneDimArray2();
		obj.oneDimArray3();
		
		obj.multiDim2DArray1();
		obj.multiDim2DArray2();
		obj.multiDim2DArray3();
		
		obj.multiDim3DArray1();
	}
}


/*
o/p - multiDim3DArray3
1	2	3	4	5	6	7	
8	9	10	11	12	13	14	

15	16	17	18	19	20	21	
22	23	24	25	26	27	28	

29	30	31	32	33	34	35	
36	37	38	39	40	41	42	

43	44	45	46	47	48	49	
50	51	52	53	54	55	56
*/

// sort
// fill
// binary search
// equals

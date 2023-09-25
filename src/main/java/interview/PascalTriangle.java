package interview;

//1
//11
//121
//1331
//14641


public class PascalTriangle {

	public void printPascal(int row)
	{
	  for (int r = 1; r <= row; r++)
	  {
	    int C = 1;  // used to represent C(line, i)
	    for (int i = 1; i <= r; i++)  
	    {
	      System.out.print(C);  // The first value in a line is always 1
	      C = (C * (r - i)) / i;  
	    }
	    System.out.println("");
	  }
	}
	
	
	public static void main(String [] args){
		PascalTriangle obj = new PascalTriangle();
		obj.printPascal(5);
	}
}



package brokenpractices;

/**
 * Instance 1: Keyword driver framework: method contains appx 6000 LOC on joining and it was 8000 LOC when I left  
 * 
 * instance 2: ExcelUtil class :  then 500 LOC ; now 3600 LOC | span : 2 year
 * 
 * @author Sheetal_Singh
 *
 */
public class C_BigMethodProblem {

	public static void longMethod() {
		newName();
		
		int a1 = 15;
		int b1 = 25;
		int c1 = a1+b1;
		System.out.println(c1);
		
		int a2 = 20;
		int b2 = 30;
		int c2 = a2+b2;
		System.out.println(c2);
		
		int a3 = 40;
		int b3= 50;
		int c3 = a3+b3;
		System.out.println(c3);
		
		int a4 = 70;
		int b4 = 80;
		int c4 = a4+b4;
		System.out.println(c4);
		
		int a5 = 70;
		int b5 = 80;
		int c5 = a5+b5;
		System.out.println(c5);
	}



	private static void newName() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}

	
	
	public static void longMethod2() {
		// 200 lines of code
	}
	
}

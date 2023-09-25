package brokenpractices;

/**
 * Rule: 
 * 1. The best place to make local variable is where we have to use them;
 * 2. Should have min scope. 
 * 
 * @author Sheetal_Singh
 */
public class G_LocalVariableSolution {

	public void correctUsageOfLocalVariable() {
		int num = 10; // local var
		int sum = num + 100;
		System.out.println("Sum is: " + sum);
	}
}

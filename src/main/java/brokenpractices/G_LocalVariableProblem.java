package brokenpractices;

public class G_LocalVariableProblem {

	int i = 10;
	int sum;

	public void invalidUsage() {
		sum = i + 100;
		System.out.println("Sum is: " + sum);
	}
}

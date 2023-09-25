package brokenpractices;

public class L_SwitchProblem {

	public void mySwitchMethod(String status) {

		switch (status) {
		case "o":
			System.out.println("Vacancy are Open");break;
		case "c":
			System.out.println("Vacancy has been Closed");break;
		default:
			System.out.println("Invalid status sent");
		}
	}
}

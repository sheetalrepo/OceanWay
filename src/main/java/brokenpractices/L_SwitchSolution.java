package brokenpractices;

public class L_SwitchSolution {

	private static final String OPEN_VACANCY = "o";
	private static final String CLOSED_VACANCY = "c";
	
	public void mySwitchMethod(String status) {
		switch (status) {
		case OPEN_VACANCY:
			System.out.println("Vacancy are Open");break;
		case CLOSED_VACANCY:
			System.out.println("Vacancy has been Closed");break;
		default:
			System.out.println("Invalid status sent");
		}
	}
}

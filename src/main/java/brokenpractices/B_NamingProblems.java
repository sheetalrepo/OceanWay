package brokenpractices;

public class B_NamingProblems {

	int iAge;
	String sFName;
	String lname;
	String adr;
	String c = "INDIA";
	boolean isClassicCar;

	public B_NamingProblems(int a, String f, String l, String adr) {
		this.iAge = a;
		this.sFName = f;
		this.lname = l;
		this.adr = adr;
	}
	
	
	public boolean isClassicCar() {
		return isClassicCar;
	}
	public void setClassicCar(boolean isClassicCar) {
		this.isClassicCar = isClassicCar;
	}


	public static void calculateTax(int a) {
		if(a >= 80) {
			System.out.println("Super Sr Citizen");
		}else if(a >= 60) {
			System.out.println("Sr Citizen");
		}else {
			System.out.println("Citizen");
		}
	}

	public static void calculateTax(int a, double s) {}
	
}

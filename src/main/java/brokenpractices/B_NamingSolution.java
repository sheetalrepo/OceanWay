package brokenpractices;


/**
 * Variable/Method name should convey the clear message 
 * 
 * @author Sheetal_Singh
 */
public class B_NamingSolution {

	int age;
	String firstName;
	String lastName;
	String address;
	public static final String EMP_COUNTRY = "INDIA";
	boolean classicCar;

	public B_NamingSolution(int age, String firstName, String lastName, String address) {
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	
	public boolean isClassicCar() {
		return classicCar;
	}
	public void setClassicCar(boolean classicCar) {
		this.classicCar = classicCar;
	}


	public static void calculateTaxAsPer(int age) {
		if(age >= 80) {
			System.out.println("Super Sr Citizen");
		}else if(age >= 60) {
			System.out.println("Sr Citizen");
		}else {
			System.out.println("Citizen");
		}
	}
	
	public static void calculateTaxAsPer(int age, double salary) {}
	
	
	@Override
	public String toString() {
		return "Naming2 [age=" + age + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", EMP_COUNTRY=" + EMP_COUNTRY + "]";
	}
}

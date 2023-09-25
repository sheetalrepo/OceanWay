package classes.oops;

public class OopsEncapsulationTest {
	public static void main(String args[]) {
		OopsEncapsulation obj = new OopsEncapsulation();
		obj.setName("James");
		obj.setAge(30);
		obj.setIdNum("xi432");

		System.out.println("Emp ID: " + obj.getIdNum());
		System.out.println("Name : " + obj.getName());
		System.out.println("Age : " + obj.getAge());

	}
}
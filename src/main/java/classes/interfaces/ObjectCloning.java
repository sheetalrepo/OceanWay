package classes.interfaces;

/**
 * Object can be cloned using Clonable interface Cloned object doen't change
 * value if original object get change
 *
 * Pass by reference rule applicable in cloning also
 */
public class ObjectCloning implements Cloneable {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String dname) {
		this.name = dname;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) {
		try {
			ObjectCloning obj1 = new ObjectCloning();
			obj1.setName("Dog Here");

			ObjectCloning obj2 = (ObjectCloning) obj1.clone(); // Cloning obj1 into obj2
																 
			// Displaying both the objects content
			System.out.println("Before Cloning");
			System.out.println(obj1.getName()); // Dog Here
			System.out.println(obj2.getName()); // Dog Here

			// updating obj1 value
			obj1.setName("New Dog Come");

			// cloned obj value will not changed because of orig obj value change
			System.out.println("\nAfter Cloning");
			System.out.println(obj1.getName()); // New Dog Come
			System.out.println(obj2.getName()); // Dog Here
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}

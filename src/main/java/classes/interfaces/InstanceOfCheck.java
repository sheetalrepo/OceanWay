package classes.interfaces;

/**
 * How can we check if an Interface is present in class hierarchy i.e. if some
 * super class etc has already implemented it
 *
 * Class implementing an Interface pass IS-A test
 */

interface tracable {
	void trace();
}

class Park implements tracable {
	public void trace() {
		// code
	}
}

public class InstanceOfCheck extends Park {

	public static void main(String[] args) {
		InstanceOfCheck obj = new InstanceOfCheck();

		if (obj instanceof tracable) {
			System.out.println("interface is present in hierarchy");
		} else {
			System.out.println("interface not present in hierarchy");
		}
	}
}

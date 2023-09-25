package brokenpractices;

import java.util.ArrayList;
import java.util.List;

public class K_NotConditionProblems {

	List<String> list = new ArrayList<String>();

	public void myMethod() {
		if (!list.isEmpty()) {
			// print list items
		}
	}
}

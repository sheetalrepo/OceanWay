package brokenpractices;

import java.util.ArrayList;
import java.util.List;


/**
 * Rule:
 * 1. Not condition should be extracted to new method for readability
 * 2. In case if has more than one condition then also condition should be extracted to new method
 *     e.g. if(!list.empty() && list.contains("a"))
 * 
 * 
 * @author Sheetal_Singh
 */
public class K_NotConditionSolution {

	List<String> list = new ArrayList<String>();

	public void myMethod() {
		if (isNotEmpty(list)) {
			// print list items
		}
	}

	private boolean isNotEmpty(List<String> list) {
		return !list.isEmpty();
	}
}

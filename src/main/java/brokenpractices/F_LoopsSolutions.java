package brokenpractices;

import java.util.ArrayList;
import java.util.List;

/**
 * Rule: Try to use for-each loop over normal for loop
 * 
 * Adv: 
 * 1. Less error prone, easy to understand 
 * 2. advance for loop uses iterator internally 
 * 3. Better performance than old loop
 * 
 * @author Sheetal_Singh
 */
public class F_LoopsSolutions {

	public static void forEachLoop() {
		int[] arr1 = { 0, 1, 2, 3 };
		int[] arr2 = { 0, 1, 2, 3 };

		for (int i : arr1) {
			for (int j : arr2) {
				System.out.println(i + "" + j);
			}
		}
	}

	
	public static void listIteration() {
		List<String> listOfFruits = new ArrayList<String>();
		listOfFruits.add("apple");
		listOfFruits.add("banana");
		listOfFruits.add("grapes");

		System.out.println("\n\n");
		for(String fruit: listOfFruits){
			System.out.println(fruit); 
		}
	}
	
	
	public static void main(String[] args) {
		forEachLoop();
		listIteration();
	}

}

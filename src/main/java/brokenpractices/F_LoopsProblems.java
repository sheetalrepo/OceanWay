package brokenpractices;

import java.util.ArrayList;
import java.util.List;

public class F_LoopsProblems {

	public static void normalLoop() {
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
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
		for (int i = 0; i < listOfFruits.size(); i++) {
			System.out.println(listOfFruits.get(i));
		}
	}

	public static void main(String[] args) {
		normalLoop();
		listIteration();
	}

}

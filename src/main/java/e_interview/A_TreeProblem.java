package e_interview;

import java.util.ArrayList;
import java.util.List;

public class A_TreeProblem {

	// Problem 1: Tree calculator (No sorting required)
	//
	// Background:
	// A person is standing in front of a queue of trees in a straight line. The
	// trees are of different heights.
	// Given an array of integers where each integer represent the height of the
	// tree in the same order.
	//
	// Write a program to return an array of integer representing the height of
	// the trees the person standing in-front would be able to see.


	public void treeView() {
		int[] arr = { 5, 10, 5, 9, 12, 5, 14, 15, 1 };

		int max = 0;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				count++;
				max = arr[i];
			}

		}

		System.out.println("Number of visible tree will be: "+count);
	}


	//print the tree number as well
	public void treeView2() {
		List<Integer> ls1 = List.of(5, 10, 5, 9, 12, 5, 14, 15, 1);
		List<Integer> ls2 = new ArrayList<>();
		
		int max = 0;
		int count = 0;
		
		for(int n: ls1){
			if(n > max){
				ls2.add(n);
				max = n;
				count ++;
			}
		}
		
		System.out.println("Number of visible tree will be: "+count);
		System.out.println("Number of visible tree will be: "+ls2);
	}
	
	public static void main(String[] args) {
		A_TreeProblem obj = new A_TreeProblem();
		obj.treeView();
		obj.treeView2();
	}
}

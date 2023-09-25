package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProductPurchase {

	public static void main(String[] args) {

		int balance = 50;

		Integer[] arr = { 10, 20, 40, 5, 10, 4, 1 };
		List<Integer> items = new ArrayList<Integer>(Arrays.asList(arr));

		Collections.sort(items);
		int count = 0;

		for (int item : items) {
			balance = balance - item;

			if (balance >= 0) {
				count++;
			} else {
				System.out.println("Out of budget...");
				break;
			}
		}

		System.out.println("Item purchase:" + count);
	}

}

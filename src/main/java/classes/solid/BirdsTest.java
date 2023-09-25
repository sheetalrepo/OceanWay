package classes.solid;

import java.util.ArrayList;
import java.util.List;

public class BirdsTest {
	public static void main(String[] args) {
		List<Birds> birdList = new ArrayList<Birds>();
		birdList.add(new Birds());
		birdList.add(new Crow());
		birdList.add(new Ostrich()); // break
		letTheBirdsFly(birdList);
	}

	static void letTheBirdsFly(List<Birds> birdList) {
		for (Birds b : birdList) {
			b.fly();
		}
	}
}

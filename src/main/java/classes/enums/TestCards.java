package classes.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

enum Suite{
	CLUB, DIAMOND, HEART, SPADE
}

enum Rank{
	ONE, TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING
}


class Cards{
	
	Suite suite;
	Rank rank;
	
	public Cards(Suite s, Rank r) {
		suite = s;
		rank = r;
	}

	@Override
	public String toString() {
		return "Cards [suite=" + suite + ", rank=" + rank + "]";
	}
}



public class TestCards {
	
	public void test() {
		//enum to array
		Suite[] arrSuite = Suite.values();
		Rank[] arrRank = Rank.values();
		
		//array to array list
		List<Suite> lsSuite = Arrays.asList(arrSuite);
		List<Rank> lsRank = Arrays.asList(arrRank);
		
		List<Cards> lsCards = new ArrayList<>();
		for(Suite s : lsSuite) {
			for(Rank r : lsRank) {
				lsCards.add(new Cards(s,r));
			}
		}
		
		
		//call print
		printAllCards(lsCards);
	}
	
	
	public void printAllCards(List<Cards> lsCards) {
			
		for(Cards c : lsCards) {
			System.out.println(c);
		}
	}
	
	
	public static void main(String [] args) {
		TestCards obj = new TestCards();
		obj.test();
	}
}

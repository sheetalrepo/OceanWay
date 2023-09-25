package classes.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

enum Card{
	MC(4), VISA(3),AMEX(2);
	
	private final int series;
	
	Card(int a){
		series = a;
	}
	
	int getSeries(){
		return series;
	}
}


/*
 * We can iterate enum by converting enum into List
 */
public class EnumToList {
	public static void main(String [] args){
		List<Card> ls = Arrays.asList(Card.values());
		
		for(Card enm : ls){
			System.out.println(enm+" : "+enm.getSeries());
		}
		
		
		// new method to learn
		//List<Card[]> arr = Collections.singletonList(Card.values());
		
	}
}

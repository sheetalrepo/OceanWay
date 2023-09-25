package classes.enums;

/**
 * Simple enum with key and value style
 * enum contains different methods which return value and modified value
 */
enum Mango {
	//constructor will be called with given values
	ALPHANZO(2000), MALDA(200), SAFEDA(50), LANGDA(80);

	//define variable for values
	private final int price;

	//enum constructor will initialize the variable
	Mango(int price) {
		this.price = price;
	}

	//Different methods of enum
	public int getPrice() {
		return price;
	}

	public double getWholeSalePrice(int price){
		return price * 0.80;
	}
}

public class EnumConstantsWithValues {
	public static void main(String[] args) {
		//Calling single enum value
		System.out.println(Mango.SAFEDA);   //print key
        System.out.println(Mango.SAFEDA.getPrice()); //print value
		System.out.println("");


		//Calling methods of enum
		System.out.println(Mango.SAFEDA);
		int safedaPrice = Mango.SAFEDA.getPrice();
		System.out.println(Mango.SAFEDA.getWholeSalePrice(safedaPrice));
		System.out.println("");


		//Iterating on enum values
		for (Mango obj : Mango.values()) {
			System.out.println(obj + " : " + obj.getPrice() + " : "+ obj.getWholeSalePrice(obj.getPrice()) );
		}
				
	}
}

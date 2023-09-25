package classes.enums;

enum Beer {
	godfather, kingfisher, tuborg, oldmonk // all values are implicitly public static
}

public class EnumSwitchCase {

	public static void main(String[] args) {
		Beer obj = Beer.kingfisher;
		System.out.println(obj); // kingfisher

		obj = Beer.godfather;
		if (obj == Beer.godfather)
			System.out.println("can be compared like this"); // can be compared like this
																
		switch(obj){
			case godfather: System.out.println("I am godfather");break;  //I am godfather
			case kingfisher: System.out.println("I am king");break;
			case tuborg: System.out.println("I am tuborg");break;
			case oldmonk: System.out.println("I am old");break;
			default: System.out.println("cannot be executed");
		}

	}
}

package interview;

/*
 * How to prove that String are immutable
 */
public class StringsImmutability {
	
	public void howToProveStringsAreImmutable(){
		String a = "KAAVYA";
		String b = a.replace("K", "N");
		
		System.out.println(a); // KAAVYA
		System.out.println(b); // NAAVYA
	}
	
	
	
	
	public static void main(String[] args) {
		StringsImmutability s = new StringsImmutability();
		s.howToProveStringsAreImmutable();
		
	}

}

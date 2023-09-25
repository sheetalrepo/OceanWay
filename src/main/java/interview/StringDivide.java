package interview;

//Q: From a string separate out even and odd index characters	
public class StringDivide {

	
	public void test1() {
		String str = "0123456789";
		String even = "";
		String odd = "";

		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0) {
				even = even + str.charAt(i);
			} else {
				odd = odd + str.charAt(i);
			}
		}
		System.out.println(str + " : " + even + " " + odd);
	}

	
	//memory efficient way
	public void test2() {
		String str = "0123456789";
		char[] arr = str.toCharArray();

		char[] even = new char[arr.length / 2];
		char[] odd = new char[arr.length / 2];
		int ev = 0;
		int od = 0;

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				even[ev] = arr[i];
				ev++;
			} else {
				odd[od] = arr[i];
				od++;
			}
		}

		System.out.println(even);
		System.out.println(odd);
	}

	public static void main(String[] args) {
		StringDivide obj = new StringDivide();
		// obj.test1();
		obj.test2();
	}

}

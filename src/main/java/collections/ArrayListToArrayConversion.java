package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArrayConversion {

	// Not to be used
	public void manualWayArrayListToArray() {
		List<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		int len = al.size();

		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = al.get(i);
		}

		System.out.println();
		for (int a : arr)
			System.out.print(a + ", "); // 10, 20, 30, 
	}
	
	
	

	public void convertingArrayListToArrays() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("100");
		al.add("200");
		al.add("300");
		//int len = al.size(); // 3

		String[] arr = new String[0]; //Array will grow dynamically if required
		arr=al.toArray(arr);
		System.out.println(arr); // object notation
		System.out.println(Arrays.toString(arr)); // [100, 200, 300]
		for (String str : arr)
			System.out.print(str + ", "); // 100, 200, 300
	}
	
	
	
	
	public void convertArrayListToString(){
		List<String> arrList = new ArrayList<>();
		arrList.add("apple");
		arrList.add("mango");
		arrList.add("orange");
		
		Object [] arr= arrList.toArray();
		System.out.println(arr);   				//Not readable    [Ljava.lang.Object;@7852e922
		
		String newStr = Arrays.toString(arrList.toArray());
		print(newStr);
	}
	

	public void print(String str){
		System.out.println(">>>  "+ str); 		// [apple, mango, orange]
	}
	
	public static void main(String [] args){
		ArrayListToArrayConversion obj=new ArrayListToArrayConversion();
		//obj.manualWayArrayListToArray();
		obj.convertingArrayListToArrays();
		//obj.convertArrayListToString();
	}
	
	
}

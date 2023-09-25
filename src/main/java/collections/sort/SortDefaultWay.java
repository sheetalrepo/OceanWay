package collections.sort;

import java.util.Arrays;

public class SortDefaultWay {

	/*
	 * Sorting String, int using default Arrays.sort(singleparam) is easy and can be done
	 * But not with class objects
	 * 
	 * To sort a class's obj we need comparable
	 */
	public static void simpleSort() {
		String [] strArray = {"d","a","c","e","b"};
		System.out.println(Arrays.toString(strArray));
		
		Arrays.sort(strArray);
		System.out.println(Arrays.toString(strArray));
		
		
		int [] intArray = {4,5,1,2,3};
		System.out.println(Arrays.toString(intArray));
		
		Arrays.sort(intArray);
		System.out.println(Arrays.toString(intArray));
	}
	
	
	
	static class SortMe{
		int age;
		String firstName;
		String lastName;
		
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		
		@Override
		public String toString() {
			return "SortMe [age=" + age + ", firstName=" + firstName + ", lastName=" + lastName + "]";
		}
		
		
		
	}
	
	
	public static void objectSort() {
		SortDefaultWay.SortMe sortme1 = new SortDefaultWay.SortMe();
		sortme1.setAge(10);
		sortme1.setFirstName("Hen");
		sortme1.setLastName("Za");
		
		SortDefaultWay.SortMe sortme2 = new SortDefaultWay.SortMe();
		sortme2.setAge(20);
		sortme2.setFirstName("Macho");
		sortme2.setLastName("Nacho");
		
		SortDefaultWay.SortMe sortme3 = new SortDefaultWay.SortMe();
		sortme3.setAge(30);
		sortme3.setFirstName("Charli");
		sortme3.setLastName("Harley");
		
		
		SortDefaultWay.SortMe[] arrayObj = new SortDefaultWay.SortMe[3];
		arrayObj[0] = sortme1;
		arrayObj[1] = sortme2;
		arrayObj[2] = sortme3;
		
		
		System.out.println(Arrays.toString(arrayObj));
		Arrays.sort(arrayObj);
		System.out.println(Arrays.toString(arrayObj));
	}
	
	
	
	
	public static void main(String[] args) {
		simpleSort();  //possible
		objectSort();  //not possible, run time exception
	}

}

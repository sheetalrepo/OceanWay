package collections.sort.comparator;

import java.util.Arrays;
import java.util.Comparator;

/**
 * With comparator we can do custom sorting and multiple way of sorting can also be used
 * 
 * With Comparable also we can do custom sorting but we can defined only one compareTo() method
 * But with Comparator we can make any number of sorting methods like sortById, sortByName, sortBySalary
 * Also we don't need to implement Comparator interface
 */
public class SortClassWithComparator {

	
	public static void sortEmployee() {
		Employee e1 = new Employee();
		e1.setEid(100);
		e1.setName("Beta");
		e1.setSalary(1000);
		
		Employee e2 = new Employee();
		e2.setEid(200);
		e2.setName("Alpha");
		e2.setSalary(5000);
		
		Employee e3 = new Employee();
		e3.setEid(300);
		e3.setName("Charli");
		e3.setSalary(500);
		
		Employee [] employees = new Employee[3];
		employees[0] = e1;
		employees[1] = e2;
		employees[2] = e3;
		
		
		System.out.println("Before: "+ Arrays.toString(employees));
		//Arrays.sort(employees);
		
		
		//sort using Lambadas
		Arrays.sort(employees, (a,b) -> a.getSalary() - b.getSalary() );
		System.out.println("Sort By Salary(Lambada): "+ Arrays.toString(employees));

		
		//sort using Anonymous Class
		Arrays.sort(employees, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getSalary() - e2.getSalary();
			}
			
		});
		System.out.println("Sort By Salary: "+ Arrays.toString(employees));
		

		//sort using user methods
		Arrays.sort(employees, Employee.comparatorBySalaray);
		System.out.println("Sort By Salary: "+ Arrays.toString(employees));
		
		Arrays.sort(employees, Employee.comparatorByName);
		System.out.println("Sort By Name: "+ Arrays.toString(employees));
		
		
	}
	
	
	public static void main(String[] args) {
		sortEmployee();
	}

}

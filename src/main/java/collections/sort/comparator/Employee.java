package collections.sort.comparator;

import java.util.Comparator;

public class Employee {
	int eid;
	String Name;
	int salary;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", Name=" + Name + ", salary=" + salary + "]";
	}
	
	
	
	public static Comparator<Employee> comparatorBySalaray = new Comparator<Employee>() {
		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.getSalary() - e2.getSalary();
		}
	};
	
	
	public static Comparator<Employee> comparatorByName = new Comparator<Employee>() {
		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.getName().compareTo(e2.getName());
		}
	};
	
}

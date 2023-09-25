package solutions.domai_map;

import java.util.Map;


/**
 * Domain POJOs are created to map raw/files/excel/pdf data to Java Objects
 * We need to parse excel/pdf row by row and need to update POJOs 
 * Using this we can convert normal data into Java object
 * 
 * note: generally pojos contains only getter setters but we can include a method which will create and return a new object of domain class
 */
public class EmployeeDomain {

	//these can be excel file title etc
	String empId;
	String empName;
	String empProfile;
	String empPosition;
	String empExperience;
	
	// getter setters
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpProfile() {
		return empProfile;
	}
	public void setEmpProfile(String empProfile) {
		this.empProfile = empProfile;
	}
	public String getEmpPosition() {
		return empPosition;
	}
	public void setEmpPosition(String empPosition) {
		this.empPosition = empPosition;
	}
	public String getEmpExperience() {
		return empExperience;
	}
	public void setEmpExperience(String empExperience) {
		this.empExperience = empExperience;
	}
	
	//method is static, it will be easy to use
	public static EmployeeDomain getEmployeeDomainObject(Map<String, String> map){
		EmployeeDomain newObj = new EmployeeDomain();
		newObj.setEmpId(map.get("Employee ID"));
		newObj.setEmpName(map.get("Employee Name"));
		newObj.setEmpProfile(map.get("Employee Profile"));
		newObj.setEmpPosition(map.get("Employee Position"));
		newObj.setEmpExperience(map.get("Employee Experience"));
		return newObj;
	}
	
}

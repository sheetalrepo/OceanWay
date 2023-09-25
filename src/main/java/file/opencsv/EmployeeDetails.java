package file.opencsv;

public class EmployeeDetails {

	String eID;
	String eName;
	String eAge;
	String eDept;
	
	//getters and setters
	public String geteID() {
		return eID;
	}
	public void seteID(String eID) {
		this.eID = eID;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteAge() {
		return eAge;
	}
	public void seteAge(String eAge) {
		this.eAge = eAge;
	}
	public String geteDept() {
		return eDept;
	}
	public void seteDept(String eDept) {
		this.eDept = eDept;
	}
	
	
	@Override
	public String toString() {
		return "EmployeeDetails [eID=" + eID + ", eName=" + eName + ", eAge="
				+ eAge + ", eDept=" + eDept + "]";
	}
}

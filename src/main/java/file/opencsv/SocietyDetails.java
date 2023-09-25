package file.opencsv;

import com.opencsv.bean.CsvBindByName;

public class SocietyDetails {
	
	//column not required as member name is same as csv column name
	@CsvBindByName
	String soceityName;
	
	@CsvBindByName(column = "Scty-Age")
	String soceityAge;
	
	@CsvBindByName(column = "Scty-Flat-Count")
	String soceityFlatCount;
	
	@CsvBindByName(column = "Scty-City", required = true)
	String soceityCity;
	
	//getters and setters
	public String getSoceityName() {
		return soceityName;
	}
	public void setSoceityName(String soceityName) {
		this.soceityName = soceityName;
	}
	public String getSoceityAge() {
		return soceityAge;
	}
	public void setSoceityAge(String soceityAge) {
		this.soceityAge = soceityAge;
	}
	public String getSoceityFlatCount() {
		return soceityFlatCount;
	}
	public void setSoceityFlatCount(String soceityFlatCount) {
		this.soceityFlatCount = soceityFlatCount;
	}
	public String getSoceityCity() {
		return soceityCity;
	}
	public void setSoceityCity(String soceityCity) {
		this.soceityCity = soceityCity;
	}
	
//	@Override
//	public String toString() {
//		return "SoceityDetails [soceityName=" + soceityName + ", soceityAge="
//				+ soceityAge + ", soceityFlatCount=" + soceityFlatCount
//				+ ", soceityCity=" + soceityCity + "]";
//	}


}

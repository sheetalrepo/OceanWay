package solutions.run_tc_from_excel;

import java.util.List;


/**
 * We are trying to read excel and convert it into logical Pojo classes
 * Later will play with java objects
 *
 */
public class ExcelPojo {

	String testCaseId;
	List<KeyValuePojo> listKeyValuePojo;  // scenario1 > scenario2 
	
	public String getTestCaseId() {
		return testCaseId;
	}
	public void setTestCaseId(String testCaseId) {
		this.testCaseId = testCaseId;
	}
	public List<KeyValuePojo> getListKeyValuePojo() {
		return listKeyValuePojo;
	}
	public void setListKeyValuePojo(List<KeyValuePojo> listObj) {
		this.listKeyValuePojo = listObj;
	}
	

}

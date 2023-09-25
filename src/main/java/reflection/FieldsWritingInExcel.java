package reflection;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class FieldsWritingInExcel {

	// excel to be written
	static File path = new File(".\\target\\reflection.xls");

	public void writeDataToExcel(FieldsClass obj) throws
            WriteException, IOException, IllegalArgumentException,
			IllegalAccessException {

		Field[] field = obj.getClass().getDeclaredFields();

		WritableWorkbook writableWorkbook = Workbook.createWorkbook(path);
		WritableSheet writableSheet = writableWorkbook.createSheet("TextContext Results", 0);
		writableSheet.addCell(new Label(0, 0, "Id"));
		writableSheet.addCell(new Label(1, 0, "Desc"));

		Integer rowNum = 0;

		for (Field f : field) {
			f.setAccessible(true);
			if (f.getName().equalsIgnoreCase("myMap")) {
				HashMap<String, Object> hm = (HashMap<String, Object>) f.get(obj);

				for (Entry<String, Object> entry : hm.entrySet()) {

					writableSheet.addCell(new Label(0, ++rowNum, entry.getKey()));
					String value = entry.getValue() == null ? new String("")
							: (String) entry.getValue();
					writableSheet.addCell(new Label(1, rowNum, value));
				}
			}else if(f.getName().equalsIgnoreCase("studentName")){
				System.out.println(f.getName());
				String s = (String) f.get(obj);
				System.out.println(s);
			}else{
				System.out.println(f.getName());
				int a = (int) f.get(obj);
				System.out.println(a);
			}
		}

		// closing writable Workbook.
		writableWorkbook.write();
		writableWorkbook.close();
	}

	public static void main(String[] args) throws
            WriteException, IllegalArgumentException, IllegalAccessException,
			IOException {

		
		
		// initialize class members
		Map<String, String> map = new HashMap<>();
		map.put("a", "1");
		map.put("b", "2");
		map.put("c", "3");

		FieldsClass obj = new FieldsClass();
		obj.setMyMap(map);
		obj.setRollNumber(17);
		obj.setStudentName("kaavya");

		// calling
		FieldsWritingInExcel fw = new FieldsWritingInExcel();
		fw.writeDataToExcel(obj);

		System.out.println("Excel file with all map fields written in: .\\target\\reflection.xls");
		
	}

}

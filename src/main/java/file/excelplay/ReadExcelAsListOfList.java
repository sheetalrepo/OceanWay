package file.excelplay;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.base.Throwables;

public class ReadExcelAsListOfList {

	public void readExcel() throws IOException {
		String dataFile = "\\src\\main\\java\\file\\excelplay\\TestData.xlsx";
		String sheetToBeRead = "sample1";
		
		File file = new File(System.getProperty("user.dir") + dataFile);
		FileInputStream fis = new FileInputStream(file);
		List<List<String>> bigList = null;
		try {
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet(sheetToBeRead);
			Iterator itr = sheet.rowIterator();
			bigList = new ArrayList<>();
			while (itr.hasNext()) {
				Row row = (Row) itr.next();
				List<String> ls;
				if (row.getCell(0).getStringCellValue().equalsIgnoreCase("yes")) {
					ls = new ArrayList<>();
					Iterator<Cell> c = row.cellIterator();
					while (c.hasNext()) {
						Cell cell = c.next();
						ls.add(cell.toString());
						System.out.print(cell.toString());
					}

					bigList.add(ls);
				}

			}
			System.out.println("size=>" + bigList.size());
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		printMe(bigList);

		// return listObj1;
	}

	public void printMe(List<List<String>> list) {

		for (List<String> ls : list) {
			System.out.print(ls);
		}

	}
	
	
	public static List<String> readParticularColumnInExcel(String excelPath, int sheetIndex, int columnIndex) {
		List<String> values = new ArrayList<>();
		File file = new File(excelPath);
		
		try(Workbook wb = new HSSFWorkbook(new FileInputStream(file))) {
			org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheetAt(sheetIndex);
			
			for(Row row : sheet){
				Cell cell = row.getCell(columnIndex);
				values.add(cell.getStringCellValue());
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return values;
	}
	public static void main(String[] args) throws IOException {
		ReadExcelAsListOfList obj = new ReadExcelAsListOfList();
		obj.readExcel();
		readParticularColumnInExcel("file path",0,5);
	}

}

package mysql;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*
 * check DBToExcel.java and delete this class
 */
public class ExcelDBApache {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connect = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/test", "root", "xebia@123");
	
		Statement statement = connect.createStatement();
		ResultSet resultSet = statement
				.executeQuery("SELECT * FROM xebia.DemoTable");

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet spreadsheet = workbook.createSheet("sheet1");
		XSSFRow row = spreadsheet.createRow(0);
		XSSFCell cell;
		cell = row.createCell(0);
		cell.setCellValue("EMP ID");
		cell = row.createCell(1);
		cell.setCellValue("EMP NAME");
		cell = row.createCell(2);
		cell.setCellValue("PROJECT");

		int i = 1;
		while (resultSet.next()) {
			row = spreadsheet.createRow(i);
			cell = row.createCell(0);
			cell.setCellValue(resultSet.getString("eid"));
			cell = row.createCell(1);
			cell.setCellValue(resultSet.getString("ename"));
			cell = row.createCell(2);
			cell.setCellValue(resultSet.getString("eproject"));

			i++;
		}
		FileOutputStream out = new FileOutputStream(
				new File(
						"C:\\Users\\sheetalsingh\\Desktop\\Xebia\\labs\\exceldatabase2.xlsx"));
		workbook.write(out);
		workbook.close();
		out.close();
		System.out.println("Data written successfully");
	}
}
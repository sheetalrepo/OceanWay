package file.excelplay;
import java.sql.SQLException;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;


public class FilloExcel {

	public static void main(String[] args) throws FilloException, SQLException {
		String dataFile = "\\src\\main\\java\\file\\excelplay\\fillo.xlsx";
		String file = System.getProperty("user.dir") + dataFile;
		
		Fillo fillo = new Fillo();
		Connection connection = fillo.getConnection(file);
		String strQuery="Select * from set1 where ID=3 and name='C'";
		Recordset recordset=connection.executeQuery(strQuery);
		
		
		while(recordset.next()){
			System.out.println(recordset.getField("Age"));
		}
		 
		recordset.close();
		connection.close();
	}

}

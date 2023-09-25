package mysql;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Delete table based on given column values in a flat file with multiple column
 */
public class DeleteDBBasedOnColumn {

	List<String> column;
	Statement statement = null;

	public void readFileAndFetchColumn() {
		String inputFile = "/home/xeadmin/Documents/projects/ctr/employee";
		String fileSeparator = "\\|";
		int counter = 0;
		FileReader fr;
		try {
			column = new ArrayList<String>();
			fr = new FileReader(inputFile);
			BufferedReader br = new BufferedReader(fr);
			String line;

			while ((line = br.readLine()) != null) {
				counter++;
				List<String> fileList = new ArrayList<String>(
						Arrays.asList(line.split(fileSeparator)));
//				System.out.println(fileList);
				String basketId2 = fileList.get(33); // fetch basketid2 column
//				String basketId2 = fileList.get(6); 
				column.add(basketId2); // add all Basketid2 into new array
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("FNF Exception at line no: " + counter);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IO Exception at line no: " + counter);
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception at line no: " + counter);
			e.printStackTrace();
		}
		System.out.println("BasketKey2 fetched successfully");
//		System.out.println("col data:"+column);
	}

	public void getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connect;
			connect = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/xebia", "root", "xebia@123");
			statement = connect.createStatement();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("DB Connected...");
	}

	public void deleteTable() {
		String tableName = "CTR_BASKET_SALES_SUMM";
		String columnName = "BASKET_KEY_2";
//		String columnName = "lname";
		int counter = 0;
		for (String col : column) {
			counter++;
			String query = "delete FROM " + tableName + " where "
					+ columnName + "='" + col+"'";
			System.out.println("query:" + query);
			try {
				statement.executeUpdate(query);
			} catch (SQLException e) {
				System.out.println("SQL Exception at " + counter);
				e.printStackTrace();
			}
		}
		System.out.println("Data deleted successfully");
	}

	public static void main(String[] args) {
		DeleteDBBasedOnColumn obj = new DeleteDBBasedOnColumn();
		obj.readFileAndFetchColumn();
		obj.getConnection();
//		obj.deleteTable();
	}
}

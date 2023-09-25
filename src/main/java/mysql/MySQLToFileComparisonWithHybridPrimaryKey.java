package mysql;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * This class will compare data between MySQL and flat files  
 * Here primary key is hybrid i.e. combination of mult columns
 * logic : Get hybrid primary key from DB and find this combination in complete file, if found then compare column by column
 */
public class MySQLToFileComparisonWithHybridPrimaryKey {
	Statement statement = null;

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

	public void compareMySQLResultsWithFlatFileWithHybridPrimKey() {
		ResultSet rs = null;
		String query = "SELECT * FROM xebia.Employee";
		String inputFile = "/home/xeadmin/Documents/projects/ctr/employeedata";
		String fileSeparator = "\\|";
		String pKeyFileSeparator = "\\_";
		try {
			rs = statement.executeQuery(query);

			int columnCount = 7; // total no. of column in DB and File
			int row=0;
			while (rs.next()) {
				row++;
				System.out.println("reading db row: "+ row);
				
				String pKeyHybrid="eid_ename_eproject";
//				String pKeyHybrid="eproject";
				List<String> pKeyList = new ArrayList<String>(Arrays.asList(pKeyHybrid.split(pKeyFileSeparator)));
				List<String> pKeyData= new ArrayList<String>();

				// adding all pri key data into pKeyData array 
				for(String pKey: pKeyList){
					pKeyData.add(rs.getString(pKey));
				}
				
				FileReader fr = new FileReader(inputFile);
				BufferedReader br = new BufferedReader(fr);
				String line;
				boolean keyFound = false;
				while ((!keyFound) && (line = br.readLine()) 	!= null) {      // read file line by line
					List<String> fileList = new ArrayList<String>(
							Arrays.asList(line.split(fileSeparator)));
					if(fileList.containsAll(pKeyData)){
						keyFound = true;                   // if key found stop further reading of file and exit loop
						List<String> dbList = new ArrayList<String>();     // if key found in file only then read complete db row
						for (int i = 1; i <= columnCount; i++) {
							dbList.add(rs.getString(i));
						}

//						boolean compare = dbList.containsAll(fileList);
						boolean compare = fileList.containsAll(dbList);  // file data shd be present in DB because source is file and dest is DB
						System.out.println("Is Array matched: " + compare);
						if (!compare) {
							ArrayList<String> err = new ArrayList<String>();
							for(int i=0;i<columnCount;i++){
								err.add(fileList.get(i).equals(dbList.get(i)) ? "Yes": "No");
							}
							System.out.println(err);      // mismatched token will show 'No'
						}	
					}
				}
				br.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		MySQLToFileComparisonWithHybridPrimaryKey obj = new MySQLToFileComparisonWithHybridPrimaryKey();
		obj.getConnection();
		obj.compareMySQLResultsWithFlatFileWithHybridPrimKey();
	}
}








/*mysql> select * from Employee;
+-----+---------------+----------+------------+---------+------------+
| eid | ename         | eproject | start_date | sal     | start_time |
+-----+---------------+----------+------------+---------+------------+
| 101 | John          | Google   | 2015-01-01 |  500.00 | 11:00:05   |
| 102 | Mike          | Yahoo    | 2015-01-01 |  500.00 | 11:00:05   |
| 103 | Dan Armstrong | Bing     | 2015-05-25 | 2313.45 | 15:38:30   |
| 104 | Bob           | Xebia    | 2015-01-01 |  500.00 | 11:00:05   |
| 104 | Bob           | Xebia123 | 2014-01-20 |  500.00 | 00:00:00   |
| 104 | Bob123        | Xebia123 | 2014-01-20 |  500.00 | 00:00:00   |
+-----+---------------+----------+------------+---------+------------+
6 rows in set (0.00 sec)

mysql> desc Employee;
+------------+---------------+------+-----+---------+-------+
| Field      | Type          | Null | Key | Default | Extra |
+------------+---------------+------+-----+---------+-------+
| eid        | int(11)       | NO   | PRI | 0       |       |
| ename      | varchar(20)   | NO   | PRI |         |       |
| eproject   | varchar(20)   | NO   | PRI |         |       |
| start_date | date          | YES  |     | NULL    |       |
| sal        | decimal(12,2) | YES  |     | NULL    |       |
| start_time | time          | YES  |     | NULL    |       |
+------------+---------------+------+-----+---------+-------+
*/

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
 * This class will compare data between MySQL DB and flat files 
 * flat files are pipe separated and has different data in rows
 */
public class MySQLToFileComparison {
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

	public void compareMySQLResultsWithFlatFile() {
		ResultSet rs = null;
		String query = "SELECT * FROM xebia.Employee";
		String inputFile = "/home/xeadmin/Documents/projects/ctr/employeedata";
		String fileSeparator = "\\|";
		try {
			rs = statement.executeQuery(query);

			int columnCount = 6; // total no. of column in DB and File
			int row=0;
			while (rs.next()) {
				row++;
				System.out.println("reading db row: "+ row);
				String primaryKey = rs.getString("eid");  // primary key passed

				FileReader fr = new FileReader(inputFile);
				BufferedReader br = new BufferedReader(fr);
				String line;
				boolean keyFound = false;
				while ((!keyFound) && (line = br.readLine()) != null) {      // read file line by line
					List<String> fileList = new ArrayList<String>(
							Arrays.asList(line.split(fileSeparator)));
					for (String token : fileList) {
						if (token.equals(primaryKey)) {
							keyFound = true;                   // if key found stop further reading of file and exit loop
							List<String> dbList = new ArrayList<String>();     // if key found in file only then read complete db row
							for (int i = 1; i <= columnCount; i++) {
								dbList.add(rs.getString(i));
							}

							boolean compare = fileList.containsAll(dbList);
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
		MySQLToFileComparison obj = new MySQLToFileComparison();
		obj.getConnection();
		obj.compareMySQLResultsWithFlatFile();
	}
}

/*
table structure: 
mysql> select * from Employee;
+-----+---------------+----------+------------+---------+------------+
| eid | ename         | eproject | start_date | sal     | start_time |
+-----+---------------+----------+------------+---------+------------+
| 101 | John          | Google   | NULL       |    NULL | NULL       |
| 102 | Mike          | Yahoo    | NULL       |    NULL | NULL       |
| 103 | Dan Armstrong | Bing     | 2015-05-25 | 2313.45 | 15:38:30   |
| 104 |               | Xebia    | NULL       |    NULL | NULL       |
+-----+---------------+----------+------------+---------+------------+


+------------+---------------+------+-----+---------+-------+
| Field      | Type          | Null | Key | Default | Extra |
+------------+---------------+------+-----+---------+-------+
| eid        | int(11)       | NO   | PRI | 0       |       |
| ename      | varchar(20)   | YES  |     | NULL    |       |
| eproject   | varchar(20)   | YES  |     | NULL    |       |
| start_date | date          | YES  |     | NULL    |       |
| sal        | decimal(12,2) | YES  |     | NULL    |       |
| start_time | time          | YES  |     | NULL    |       |
+------------+---------------+------+-----+---------+-------+

File Structure
#eid|ename|eproject|start_date|sal|start_time|
101|John|Google|||
102|Mike|Yahoo|||
103|Dan Armstrong|Bing|2015-05-25|2313.45|15:38:30
*/
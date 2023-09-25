package mysql;

import java.sql.*;

/*
 * To read Mysql data and print on console
 */
public class JavaMySQL {

	private Connection conn = null;

	public void getConnectionAndPrintData() {
		try {
			String myUrl = "jdbc:mysql://localhost:3306/test";
			String username = "root";
			String password = "xebia@123";

			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(myUrl, username, password);
			System.out.println("DB created");

			String query = "SELECT * FROM xebia.DemoTable";

			Statement st = conn.createStatement();

			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
				String id = rs.getString("eid");
				String name = rs.getString("ename");
				String project = rs.getString("eproject");
				System.out.format("%s, %s, %s\n", id, name, project);
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		JavaMySQL obj = new JavaMySQL();
		obj.getConnectionAndPrintData();
	}
}
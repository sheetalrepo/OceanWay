package solutions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

/**
 * High level idea where all standard query can be placed in single class
 * parameter can be passed to query and Map or RS can be retrieved
 * connection should be singleton i.e. if a live connection is present then new connection should not be created again
 */
public class DynamicDBQuery {
	public static Connection connection;
	private Statement statement = null;
	private ResultSet resultSet = null;
	
	
	private static Connection getDatabaseConnection() {
		try {
			Class.forName("oracle.xx.xx.xx");
			connection = DriverManager.getConnection("url", "username", "password");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	public ResultSet executeDatabaseQuery(String query) {
		connection = getDatabaseConnection();
		try {
			this.statement = connection.createStatement();
			this.resultSet = statement.executeQuery(query);	
		} catch (SQLException | NullPointerException e) {			
			e.printStackTrace();
		}

		return this.resultSet;
	}
	
	public static final String GENERIC_DB_QUERY = "SELECT NAME, RANK FROM TABLE_A "
			+ "WHERE ID = '%s'"
			+ "AND TYPE = '%s'"
			+ "AND CAT = 'TEST'";
	
	public Map<String, String> test() throws SQLException{
		String dbDynamicQuery = String.format(GENERIC_DB_QUERY, "101", "MyType");
		System.out.println("Final Query: "+ dbDynamicQuery);
		ResultSet rs = executeDatabaseQuery(dbDynamicQuery);
		
		Map<String, String> map = new HashMap<>();	
		map.put("NAME",rs.getString("NAME") );
		map.put("RANK",rs.getString("RANK") );
		
		return map;
	}
	
	
	public static void main(String[] args) throws SQLException {
		DynamicDBQuery obj = new DynamicDBQuery();
		Map<String, String> map = obj.test();
		System.out.println(map);
	}

}

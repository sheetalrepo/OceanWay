package classes.exceptions;
import java.sql.*;

/**
 * Note: SQLException is checked exception
 */
public class CheckedExamples {

	/**
	 * Using catch we try to save the program by again creating a connection in attempt 2
	 */
	public static void getTheDataAtAnyCost() {
		 try {
			 Class.forName("com.mysql.jdbc.Driver");
			 Connection conn = DriverManager.getConnection("com.mysql.jdbc.Driver","USER","PASS");
		 } catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Connection error: Retry to create connection...");
		 } catch (ClassNotFoundException e) {
			 System.out.println("ClassNotFoundException");
		}
	}
	
	
	/**
	 * Here user have catched the exception but again converted it into runtime exception
	 * User intentionally crashed the program as no use to continue the program if there is no connection to the DB
	 * This way we can give appropriate message in exception
	 */
	public static void getTheDataIfConnectionIsCorrect1() {
		 try {
			  Connection conn = DriverManager.getConnection("DB_URL","USER","PASS");
		 } catch (SQLException e) {
			  throw new RuntimeException("I have catched the exceptions and dont want to save the program and let the exception crash it");
		 }
	}
	
	

	/**
	 * Here user has dont want to save the program and simply throws the exception
	 * We can't give user defined message if we throws exception 
	 */
	public static void getTheDataIfConnectionIsCorrect2() throws SQLException {
		 Connection conn = DriverManager.getConnection("DB_URL","USER","PASS");		 
	}
	
	
	
	
	public static void checkedCanBeThrow() throws SQLException {
		 throw new SQLException("Wow checked can also be throw same as runtime exception");
	}
	
	
	public static void main(String[] args) throws SQLException {
//		getTheDataAtAnyCost();
//		getTheDataIfConnectionIsCorrect1();
//		getTheDataIfConnectionIsCorrect2();
		checkedCanBeThrow();
	}
}

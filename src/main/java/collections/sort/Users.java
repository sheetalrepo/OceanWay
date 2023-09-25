package collections.sort;


/*
 * To sort simple list of strings, int we can simply use Collections.sort(list)
 * Comparable used to sort objects of any customized class like Users - i doubt???
 * Comparable<T> take generic type, it can be anything like username, String, int etc 
 * 
 */
public class Users implements Comparable<Users> {

	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * +ve nos 	:  this object is greater than the object we are comparing to i.e. 'User usr' in this case
	 * 0  		:  both objects are equals
	 * -ve nos 	:  this object is lower than 'User usr' object  
	 * 
	 * 
	 * consider a list [1,2,3,5,4]
	 * 1<2 : -ve no : nothing will happen from java side
	 * 2<3 : -ve no : same as above
	 * 3<5 : -ve no : same as above
	 * 5>4 : +ve no : java will swap to nos
	 * 
	 * so list will be sorted now:  [1,2,3,4,5]
	 */
	@Override
	public int compareTo(Users usr) {
		return this.username.compareTo(usr.getUsername());   // return -21
	}
	
}

package collections;

import java.util.Properties;
import java.util.Set;

/*
 * Dictionary > Hashtable > Properties
 * Properties is not generic, its key and value both are strings
 */
public class PropertiesExamples {

	public void basicFunctionality() {
		Properties prop = new Properties();
		prop.put("in", "India");
		prop.put("pk", "Pakistan");
		prop.put("us", "USA");
		prop.put("cn", "China");

		System.out.println(prop.getProperty("us")); // USA
		System.out.println(prop.getProperty("nz")); // null
		System.out.println(prop.getProperty("nz", "unknown")); // unknown , default value
		System.out.println();

		Set<Object> set = prop.keySet();
		for (Object key : set) {
			System.out.print(key + "-" + prop.getProperty((String) key) + ", ");
			// in-India, pk-Pakistan, us-USA, cn-China,
		}
	}

	/*
	 * default values can be better handle in this code
	 */
	public void defaultFunctionality() {
		Properties defaultprop = new Properties();
		defaultprop.put("nz", "unknown");
		defaultprop.put("sa", "unknown");

		Properties prop = new Properties(defaultprop);
		prop.put("in", "India");
		prop.put("pk", "Pakistan");
		prop.put("us", "USA");
		prop.put("cn", "China");

		System.out.println(prop.getProperty("nz")); // unknown
		System.out.println(prop.getProperty("in")); // India
	}

	public static void main(String[] args) {
		PropertiesExamples obj = new PropertiesExamples();
		// obj.basicFunctionality();
		obj.defaultFunctionality();
	}
}

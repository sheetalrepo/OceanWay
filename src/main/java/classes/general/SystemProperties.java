package classes.general;

import java.util.Properties;

public class SystemProperties {

	public static void main(String[] args) {

		// Generally Used
		System.out.println("user.dir = "+System.getProperty("user.dir"));		  //  /Users/sheetalsingh/Documents/workspace/OceanWay
		System.out.println("file.separator = "+System.getProperty("file.separator")); //  
		System.out.println("os.name = "+System.getProperty("os.name"));		  //  Mac OS X
		System.out.println("user.name = "+System.getProperty("user.name"));   // username
		System.out.println("user.home = "+System.getProperty("user.home"));    // C:\Users\e075583
		
		
		System.out.println("\n\n\n");

		//All are valid format
		//String pdfPath = "C:\\Users\\e075583\\Documents\\myworkspace\\OceanWay\\src\\main\\java\\pdf\\sample1.pdf";
		//String pdfPath = "C:/Users/e075583/Documents/myworkspace/OceanWay/src/main/java/pdf/sample1.pdf";
		//String pdfPath = "C:/Users/e075583/Documents/myworkspace/OceanWay/src/main/java/pdf/sample1.pdf";

		
		// this will list the current system properties
		Properties p = System.getProperties();
		p.list(System.out);
	}

}

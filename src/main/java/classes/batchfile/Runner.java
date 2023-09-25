package classes.batchfile;

import java.io.IOException;

public class Runner {

	
	public static void executeBatchFile(){
		String rawPath = System.getProperty("user.dir")+"\\src\\main\\java\\classes\\batchfile\\sample.bat";
		String path="cmd /c start "+ rawPath;
		Runtime rn=Runtime.getRuntime();
		try {
			Process pr=rn.exec(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		executeBatchFile();
	}
}

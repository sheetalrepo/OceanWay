package file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadConsoleUsingBufferedReader {

	/*
	 * read() reads the characters and user has to enter in console to input new
	 * value
	 */
	public void readMethod() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c;
		String name = "";
		while ((c = br.read()) != 'q') {
			name = name + (char) c;
		}
		System.out.print(name);
	}

	/*
	 * this method will read complete line and exit when we write "stop"
	 */
	public void readLineMethod() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		while (!(str = br.readLine()).equals("stop")) {
			System.out.println(">>" + str);
		}

	}

	public static void main(String[] args) {
		ReadConsoleUsingBufferedReader obj = new ReadConsoleUsingBufferedReader();
		try {
			// obj.readMethod();
			obj.readLineMethod();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

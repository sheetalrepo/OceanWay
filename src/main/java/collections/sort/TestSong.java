package collections.sort;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Here we read a file and sorted according to song title !!! great job
 * 
 * But wait ...
 * Boss wants more data along with songs title like Singer, Film etc ???
 * 
 * Sol: In next example, will create a Song Class which will hold all the details
 */

public class TestSong {

	List<String> ls = new ArrayList<>();

	public void getTitle(String str) {
		String[] arr = str.split(",");
		ls.add(arr[0]); // we are interested in only title from big file
	}

	public void sortSimpleSongStrings() throws IOException {
		File classpath = new File(System.getProperty("user.dir"));
		String filepath = classpath + "/src/main/java/collections/sort/songs.txt";
		BufferedReader br = new BufferedReader(new FileReader(filepath));
		String line = null;
		int counter = 0;
		while ((line = br.readLine()) != null) {
			if (counter != 0) {
				getTitle(line);
			}
			counter++;
		}

		System.out.println(ls);
		//[Tujhe dekha, Ye sama, Hosh walalo, Meri Wafayen, Hosh walalo, Zoooo]
				
		Collections.sort(ls);
		
		System.out.println(ls);
		//[Hosh walalo, Hosh walalo, Meri Wafayen, Tujhe dekha, Ye sama, Zoooo]
		
	
		br.close();
	}

	public static void main(String[] args) throws IOException {
		TestSong obj = new TestSong();
		obj.sortSimpleSongStrings();

	}
}

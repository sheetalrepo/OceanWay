package collections.sort;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Now we create a class Songs1.java
 * Now in ls we get all the required details ... gr8 job
 * But wait... Collection.sort(song list) giving compiler error
 * Collection.sort() cannot sort an object until object class implement Comparable<T>
 * 
 * One more thing, can we sort using singer rather title
 * Yes simply change return type in compareTo() method
 * 
 * One last thing, can we get both sorted list together - title list + singer list
 * Oops using comparable we can get one list at a time
 */

public class TestSong1 {

	List<Song1> ls = new ArrayList<>();

	public void getSongDetails(String str) {
		String[] arr = str.split(",");
		
		Song1 song = new Song1(arr[0], arr[1], arr[2]);
		ls.add(song); // added song object which has all details it in
		
	}

	public void sortSongObjects() throws IOException {
		File classpath = new File(System.getProperty("user.dir"));
		String filepath = classpath + "/src/main/java/collections/sort/songs.txt";
		BufferedReader br = new BufferedReader(new FileReader(filepath));
		String line = null;
		int counter = 0;
		while ((line = br.readLine()) != null) {
			if (counter != 0) {
				getSongDetails(line);
			}
			counter++;
		}

		System.out.println(ls); // Not sorted
		//[Tujhe dekha: Kumar sanu |||, Ye sama: Lata |||, Hosh walalo: Jagjit singh |||, Meri Wafayen: Kumar sanu |||, Hosh walalo: Jagjit singh |||, Zoooo: Arijit singh |||]

		
		/**
		 * Unlike previous case here sort method will not work as Song IS NOT A Comparator
		 * If we check Set API it state :    static <T extends Comparable<? super T>> void sort(List<T> ls)
		 * means <T> should pass IS A for Comparable
		 * solution: Song implements Comparable
		 */
		
		Collections.sort(ls);
		
		System.out.println(ls);
		//[Hosh walalo: Jagjit singh |||, Hosh walalo: Jagjit singh |||, Meri Wafayen: Kumar sanu |||, Tujhe dekha: Kumar sanu |||, Ye sama: Lata |||, Zoooo: Arijit singh |||]

		br.close();
	}

	public static void main(String[] args) throws IOException {
		TestSong1 obj = new TestSong1();
		obj.sortSongObjects();

	}
}


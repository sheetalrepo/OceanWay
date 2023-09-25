package collections.sort;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *  We have sorted list but last problem left is there are duplicate songs as per title
 *  duplicate can have many definition like duplicate singer, film etc
 *  
 *  So lets put list into a Set which stop duplicate  -- This is not removing duplicate
 *  because till now we have not defined duplicate meaning
 *  
 *  So lets override hashcode and equals to define duplicate meaning for us in this case
 *  
 *  TreeSet internally uses compareTo() to sort objects, so we need to uses comparable here
 */

public class TestSong3 {

	List<Song3> ls = new ArrayList<>();
	
	public void getSongDetails(String str) {
		String[] arr = str.split(",");
		
		Song3 song = new Song3(arr[0], arr[1], arr[2]);
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

		Collections.sort(ls);
		System.out.println(ls);
		//[Hosh walalo, Hosh walalo, Meri Wafayen, Tujhe dekha, Ye sama, Zoooo]
		

		
		Set<Song3> set = new HashSet<>();
		set.addAll(ls);
		System.out.println(set);		
		//[Hosh walalo, Tujhe dekha, Ye sama, Meri Wafayen, Hosh walalo, Zoooo]
		//Boom: Duplicate still present
		
		
		//Now override equals and hence hashcode
		System.out.println(set);	
		//[Zoooo, Hosh walalo, Tujhe dekha, Meri Wafayen, Ye sama]
		//Wow: duplicate removed
		
		
		//We removed duplicate but we lost alphabetic ordering, to get back ordering + no duplicate use TreeSet
		TreeSet<Song3> ts = new TreeSet<>();
		ts.addAll(ls);
		System.out.println(ts);	
		//[Hosh walalo, Meri Wafayen, Tujhe dekha, Ye sama, Zoooo]
		
		
		br.close();
	}

	public static void main(String[] args) throws IOException {
		TestSong3 obj = new TestSong3();
		obj.sortSongObjects();

	}
}


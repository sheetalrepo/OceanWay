package collections.sort;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * We can get any number of List in one go using comparator
 * Create as many Inner class as per required list
 * So we solve the TestSong1.java problem
 * 
 * But wait.... i can see duplicates in list
 */

public class TestSong2 {

	List<Song2> ls = new ArrayList<>();

	//title inner class
	class Title implements Comparator<Song2>{
		@Override
		public int compare(Song2 o1, Song2 o2) {
			return o1.getTitle().compareToIgnoreCase(o2.getTitle());
		}
	}
	
	
	//singer inner class
	class Singers implements Comparator<Song2>{
		@Override
		public int compare(Song2 o1, Song2 o2) {
			return o1.getSinger().compareToIgnoreCase(o2.getSinger());
		}
	}
	
	
	public void getSongDetails(String str) {
		String[] arr = str.split(",");
		
		Song2 song = new Song2(arr[0], arr[1], arr[2]);
		ls.add(song); // added song object which has all details it in
		
	}

	public void sortSongObjectsByTitleAndSinger() throws IOException {
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

		//List 1: Random, as per text file order
		System.out.println(ls); // Not sorted
		//[Tujhe dekha: Kumar sanu |||, Ye sama: Lata |||, Hosh walalo: Jagjit singh |||, Meri Wafayen: Kumar sanu |||, Hosh walalo: Jagjit singh |||, Zoooo: Arijit singh |||]

		//List 2: As per Title
		Collections.sort(ls, new Title());
		System.out.println(ls);
		//[Hosh walalo: Jagjit singh |||, Hosh walalo: Jagjit singh |||, Meri Wafayen: Kumar sanu |||, Tujhe dekha: Kumar sanu |||, Ye sama: Lata |||, Zoooo: Arijit singh |||]

		//List 3: As per Singer		
		Collections.sort(ls, new Singers());
		System.out.println(ls);
		//[Zoooo: Arijit singh |||, Hosh walalo: Jagjit singh |||, Hosh walalo: Jagjit singh |||, Tujhe dekha: Kumar sanu |||, Meri Wafayen: Kumar sanu |||, Ye sama: Lata |||]

		br.close();
	}

	public static void main(String[] args) throws IOException {
		TestSong2 obj = new TestSong2();
		obj.sortSongObjectsByTitleAndSinger();

	}
}


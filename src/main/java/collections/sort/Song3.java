package collections.sort;

//use by TestSong3.java
public class Song3 implements Comparable<Song3>{

	String title, film, singer;
	
	public Song3(String t, String f, String sin){
		title = t;
		film = f;
		singer = sin;
	}

	public String getTitle() {
		return title;
	}

	public String getFilm() {
		return film;
	}

	public String getSinger() {
		return singer;
	}
	

	@Override
	public String toString() {
		return title;
	}

	/**
	 * Once adding list into Set, we lost sorting advantage
	 */
	@Override
	public int compareTo(Song3 s) {
		return title.compareToIgnoreCase(s.getTitle());
	}

	@Override
	public int hashCode(){
		return title.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Song3 s = (Song3) obj;
		return title.equals(s.getTitle());
	}
	
	
	
}

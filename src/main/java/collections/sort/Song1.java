package collections.sort;

//use by TestSong1.java
public class Song1 implements Comparable<Song1>{

	String title, film, singer;
	
	public Song1(String t, String f, String sin){
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
	
	/**
	 * overridded toString as we are printing Song objects and we want to print song title
	 * if we don't override then sysout(song's object) will not be in readable format
	 */
	@Override
	public String toString() {
		String str = title +":"+ singer+" |||";
		return str;
	}

	/**
	 * Drawback: we can sort one thing at a time either title or singer !!!
	 */
	@Override
	public int compareTo(Song1 s) {
		return title.compareToIgnoreCase(s.getTitle()); // to sort as per songs
		//return singer.compareToIgnoreCase(s.getSinger()); // to sort as per singer
	}

	
	
}

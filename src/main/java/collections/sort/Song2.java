package collections.sort;

/**
 * No need to implement Comparable here
 * We will create two separate class -  Title and Singer, they will implement comparator
 * Better create a inner class rather separate full class
 *
 */
public class Song2 {

	String title, film, singer;
	
	public Song2(String t, String f, String sin){
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



	
	
}

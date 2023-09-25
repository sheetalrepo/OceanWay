package java8.lambdas.nomoreloops;

import java.util.List;


/**
 * POJO class for Article
 * Article can have multiple tags and single author
 * 
 * Refer: https://deadcoderising.com/java-8-no-more-loops/
 */
public class Article {

    private final String title;
    private final String author;
    private final List<String> tags;

    Article(String title, String author, List<String> tags) {
        this.title = title;
        this.author = author;
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public List<String> getTags() {
        return tags;
    }

	@Override
	public String toString() {
		return "Article [title=" + title + ", author=" + author + ", tags=" + tags + "]";
	}
    
    
    
}
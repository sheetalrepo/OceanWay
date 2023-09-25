package java8.lambdas.nomoreloops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;import java.util.stream.Collector;
import java.util.stream.Collectors;

import java8.lambdas.Person;

public class TestLambadsPower {

	//Set 1
	public static String getFirstArticleWithGivenTag(String inputtag) {
		List<Article> ls = DataCreation.getData();
		
		for(Article ar: ls) {
			if(ar.getTags().contains(inputtag))
				return ar.getTitle();
		}
		return null;
	}
	
	public static Optional<String> getFirstArticleWithGivenTagWithJava8(String inputtag) {
		List<Article> ls = DataCreation.getData();
		return ls.stream()
				.filter(a -> a.getTags().contains(inputtag))
				.map(Article::getTitle)
				.findFirst();
	}
	
	
	
	
	
	
	//Set 2
	public static List<String> getAllArticleWithGivenTag(String inputtag) {
		List<Article> ls = DataCreation.getData();
		
		List<String> results = new ArrayList<String>();
		
		
		for(Article ar: ls) {
			if(ar.getTags().contains(inputtag))
				results.add(ar.getTitle());
		}
		return results;
	}
	
	public static List<String> getAllArticleWithGivenTagWithJava8(String inputtag) {
		List<Article> ls = DataCreation.getData();
		
		return ls.stream()
				.filter(a -> a.getTags().contains(inputtag))
				.map(Article::getTitle)   						// this will return specific values from object
				.collect(Collectors.toList());
	}
	
	
	
	
	
	
	
	
	// set3
	public static Map<String, List<String>> groupArticlesAsPerAuthor() {
		Map<String, List<String>> map = new HashMap<>();

		List<Article> ls = DataCreation.getData();
		for(Article ar : ls) {
			if(map.containsKey(ar.getAuthor())) {
				List<String> oldLs = map.get(ar.getAuthor());
				oldLs.add(ar.getTitle());
				map.put(ar.getAuthor(), oldLs);
			}else {
				List<String> list = new ArrayList<String>();
				list.add(ar.getTitle());
				map.put(ar.getAuthor(), list);
				//map.put(ar.getAuthor(), Arrays.asList(ar.getTitle()));  // Not working, don't know why
			}
		}
		
		return map;
	}

	//not working
	public static Map<String, List<Article>> groupArticlesAsPerAuthorWithjava8() {
		List<Article> ls = DataCreation.getData();
		
//		Map<String, List<String>> map = ls.stream()
//				.map(Article :: getAuthor)
//				.collect(Collectors.groupingBy(Article::getTitle));
		
		
		return ls.stream()
				//.map(Article::getTitle)
				//.map(x -> x.getTitle())
				.collect(Collectors.groupingBy(Article::getAuthor));
	}
	
	
	
	
	
	
	//set 4
	public static Set<String> getAllTags() {
		Set<String> set = new HashSet<>();
		
		List<Article> ls = DataCreation.getData();
		for(Article ar : ls) {
			set.addAll(ar.getTags());
		}
		return set;
	}
	
	public static Set<String> getAllTagsWithJava8() {
		List<Article> ls = DataCreation.getData();

		return ls.stream()
				.flatMap(a -> a.getTags().stream())
				.collect(Collectors.toSet());
	}

	
	
	
	public static void main(String[] args) {
//		System.out.println("----------------------");
//		System.out.println(getFirstArticleWithGivenTag("world"));
//		System.out.println(getFirstArticleWithGivenTagWithJava8("world"));
//		
//		
//		System.out.println("----------------------");
//		System.out.println(getAllArticleWithGivenTag("world"));
//		System.out.println(getAllArticleWithGivenTagWithJava8("world"));
//		
		
		System.out.println("----------------------");
		System.out.println(groupArticlesAsPerAuthor());
		System.out.println(groupArticlesAsPerAuthorWithjava8());
		
		
//		System.out.println("----------------------");
//		System.out.println(getAllTags());
//		System.out.println(getAllTagsWithJava8());
		
		
		
		
	}

}

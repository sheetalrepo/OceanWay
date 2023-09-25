package java8.lambdas.nomoreloops;


import java.util.Arrays;
import java.util.List;

public class DataCreation {

	public static List<Article> getData(){
		return Arrays.asList(
				new Article("Americans Power Tactics","Mr Arya", Arrays.asList("american","power","world","economy")),
				new Article("Bombay to Goa","Ms Bretly", Arrays.asList("bombay","india","world")),
				new Article("Cheap Phones in Market","Ms China", Arrays.asList("phones","world","economy")),
				new Article("Dog Fight in Politics","Mr Drago", Arrays.asList("power","india","fight")),
				new Article("Elehanta Caves","Mr Arya", Arrays.asList("power","elephant","caves"))
				);
	}
}

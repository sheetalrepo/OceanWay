package classes.anonymous;

/**
 * AnonymousLambdaExpression.class, paintable.class
 * i.e. AnonymousLambdaExpression$1.class has not been created in this case which improves performance
 * 
 * Lambda expression only works with @FunctionalInterface. Hence jvm know only one method present inside interface
 * that's why in lambda we can remove method name
 * 
 * 
 */
public class AnonymousLambdaExpression {

	public static void main(String [] args){
		//lambda expression - reduced line of code which improves performance
		paintable obj = () -> {
			
				System.out.println("I am painting");
		};
		
		obj.paint();  // I am painting
		
		paintable obj2 = () -> System.out.println("I am still painting");   // this syntax can be used if we have only single statement
		obj2.paint();  // I am still painting
	}
	
}


@FunctionalInterface
interface paintable{
	void paint();
}

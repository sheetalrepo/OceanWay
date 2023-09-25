package classes.staticvar;

/**
 * demo to show static var (j) is being used by all objects
 * 
 * i will not give correct result as each object has its own copy of i
 * j will give correct results as j is class variable and shared among all objects
 *
 */
public class StaticBasics {

	int i;
	static int j;
	
	public StaticBasics(){
		i++;
		j++;
	}
	
	public int getICount(){
		return i;
	}
	
	public int getJCount(){
		return j;
	}

	
	public static void main(String [] args){
		StaticBasics obj1 = new StaticBasics();
		System.out.println("obj1 count: "+obj1.getICount()+"	"+obj1.getJCount());  //1 1
		
		StaticBasics obj2 = new StaticBasics();
		System.out.println("obj2 count: "+obj2.getICount()+"	"+obj2.getJCount());  //1 2
		
		StaticBasics obj3 = new StaticBasics();
		System.out.println("obj3 count: "+obj3.getICount()+"	"+obj3.getJCount());  //1 3
		
	}
}

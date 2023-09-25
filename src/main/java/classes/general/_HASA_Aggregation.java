package classes.general;

/*
 * Aggregation is HAS A relationship
 * If a class has reference of other class then that is Aggregation
 * If there is no IS-A relationship and we need to reuse code then Aggregation is better than Inheritance
 * Aggregation is not restricted like Composition
 * College HAS A Plant, Both are independent of each other
 */

//Independent class, not depending on below class hence Aggregation
class Square{
	public int sqr(int a){
		return a*a;
	}
}

public class _HASA_Aggregation {
	Square s; // Aggregation - Current class HAS A Square 
	
	public double circleArea(int r){
		s=new Square();
		int sq=s.sqr(r); // code reuse
		return 3.14*sq;
	}
	
	public static void main(String [] args){
		_HASA_Aggregation obj=new _HASA_Aggregation();
		double res=obj.circleArea(5);
		System.out.println("Circle Area: " + res);
	}
}

package classes.annotations;

import java.lang.annotation.Annotation;

/**
 * refer: https://www.youtube.com/watch?v=o9vn4No_ii4
 * @author Sheetal_Singh
 */

//@SmartPhone
//@SmartPhone(os = "window")
@SmartPhone(os = "window", version = 3)
public class GalaxySeries {

	String os;
	int ver;
	
	public GalaxySeries(String os, int version) {
		this.os = os;
		ver = version;
	}
	
	public static void main(String[] args) {
		GalaxySeries obj = new GalaxySeries("android marshmellow", 2);
		System.out.println(obj.os); // this is obj values

		
		//To fetch annotations values via reflection api
		Class c = obj.getClass();
		Annotation an = c.getAnnotation(SmartPhone.class);
		SmartPhone sp = (SmartPhone)an;
		System.out.println(sp.os());
		System.out.println(sp.version());
		
	}
}

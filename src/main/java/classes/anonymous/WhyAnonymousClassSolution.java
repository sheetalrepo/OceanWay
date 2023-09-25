package classes.anonymous;

/**
 * Here we re defined parent class and override the same method with new feature
 * w/o creating a new class, extend and then override
 * 
 * Following file will be created:
 * AnonymousClass$1.class
 * ParentYou.class
 */

//legacy code
class ParentYou{
	public void show(){
		System.out.println("show pictures");
	}
}


//new code
public class WhyAnonymousClassSolution {
	
	public static void main(String [] args){

		//Class obj = new Class(){//code};
		
		//Using anonymous class no need to add new class which will extent legacy classes
		ParentYou obj = new ParentYou(){
			@Override
			public void show(){
				System.out.println("show me videos");
			}
		};

		obj.show(); // show me videos
	}

}




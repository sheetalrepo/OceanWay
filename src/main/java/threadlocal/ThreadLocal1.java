package threadlocal;

/**
 * ThreadLocal is personal data for every thread Kind of alternative to
 * synchronized method Used for thread safety
 *
 */
public class ThreadLocal1 {

	/**
	 * main thread accessing this method
	 * ThreadLocal will be created for main thread
	 */
	public void defaultValues() {
		ThreadLocal<String> tl = new ThreadLocal<>();
		System.out.println(tl.get()); // null

		tl.set("personal copy for main thread");
		System.out.println(tl.get()); // personal copy for main thread

		tl.remove();
		System.out.println(tl.get()); // null
	}

	
	/**
	 * To set some initial value to any thread we need to override initialValue() method
	 */
	public void initialValues() {
		ThreadLocal<String> tl = new ThreadLocal<String>(){
			
			@Override
			protected String initialValue() {
				return "abc";
			}
		};
		
		System.out.println(tl.get()); // abc

		tl.set("personal copy for main thread");
		System.out.println(tl.get()); // personal copy for main thread

		tl.remove();
		System.out.println(tl.get()); // abc
	}
	
	
	public static void main(String[] args) {
		ThreadLocal1 obj = new ThreadLocal1();
		//obj.defaultValues();
		obj.initialValues();
	}

}

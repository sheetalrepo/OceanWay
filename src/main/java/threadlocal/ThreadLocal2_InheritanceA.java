package threadlocal;

/**
 * 1. As we know every thread has its own thread local space where all data saved
 * 2. If we fetch first thread data in second thread then we will get 'null'
 * 3. But if we use 'InheritableThreadLocal' then data can be passed in next thread
 */

class FirstThread extends Thread{
	
	//public static ThreadLocal<String> tl = new ThreadLocal<>();
	public static InheritableThreadLocal<String> tl = new InheritableThreadLocal<>();
	
	
	
	//Thread-0 will execute this code
	@Override
	public void run() {
		tl.set("mango");
		System.out.println(Thread.currentThread().getName()+" First Thread Value: "+tl.get() );
		
		SecondThread st = new SecondThread();
		st.start();
	}
}


class SecondThread extends Thread{
	
	//Thread-1 will execute this code
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" First Thread Value in Second Thread: "+ FirstThread.tl.get());	
	}
}



public class ThreadLocal2_InheritanceA {
	public static void main(String[] args) {
		FirstThread ft = new FirstThread();
		ft.start();
	}
}

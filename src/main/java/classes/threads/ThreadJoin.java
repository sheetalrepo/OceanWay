package classes.threads;

/*
 * t1.join(t2) : means t1 get low priority and t1 will wait till t2 get finished
 * t1 attaches to the end of t2
 */

class DemoThread3 implements Runnable {
	Thread t;
	
	DemoThread3() {
		t=new Thread(this,"demo");
		t.start();
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread() + " - " + i);
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("demo thread finished");
	}

}

public class ThreadJoin {

	public static void main(String[] args) {
		DemoThread3 demoobj=new DemoThread3();
		System.out.println(demoobj.t.isAlive());  // true

		try {
			demoobj.t.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		System.out.println(demoobj.t.isAlive());  // false
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread() + " - " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("main thread finished");
	}
}

/* o/p is different from early code where demo and main running simultaneously and main finished before demo
true
Thread[demo,5,main] - 1
Thread[demo,5,main] - 2
Thread[demo,5,main] - 3
Thread[demo,5,main] - 4
Thread[demo,5,main] - 5
demo thread finished
false
Thread[main,5,main] - 1
Thread[main,5,main] - 2
Thread[main,5,main] - 3
Thread[main,5,main] - 4
Thread[main,5,main] - 5
main thread finished
*/
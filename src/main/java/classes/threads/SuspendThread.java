package classes.threads;

class HelloThread implements Runnable {
	Thread t;

	public HelloThread(String str) {
		t = new Thread(this, str);
		t.start();
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class SuspendThread {
	public static void main(String[] args) {
		HelloThread obj1 = new HelloThread("one-thread");
		HelloThread obj2 = new HelloThread("two-thread");

		try {
			Thread.sleep(400);
			obj1.t.suspend();

			Thread.sleep(1000);
			obj2.t.suspend();
			obj1.t.resume();

			Thread.sleep(500);
			obj2.t.resume();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}

/*
one-thread : 1
two-thread : 1
one-thread : 2
two-thread : 2
two-thread : 3      - one suspended
two-thread : 4
two-thread : 5
two-thread : 6
two-thread : 7
one-thread : 3      - one resume + two suspended 
one-thread : 4
one-thread : 5
two-thread : 8
one-thread : 6
two-thread : 9      - two resume
one-thread : 7
two-thread : 10
one-thread : 8
one-thread : 9
one-thread : 10

*/
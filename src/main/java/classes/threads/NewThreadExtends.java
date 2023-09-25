package classes.threads;

class DemoThread extends Thread {

	DemoThread() {
		super("demo");
		start();
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

public class NewThreadExtends {

	public static void main(String[] args) {
		new DemoThread();

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

/*
Thread[demo,5,main] - 1
Thread[main,5,main] - 1
Thread[main,5,main] - 2
Thread[demo,5,main] - 2
Thread[main,5,main] - 3
Thread[demo,5,main] - 3
Thread[main,5,main] - 4
Thread[main,5,main] - 5
Thread[demo,5,main] - 4
main thread finished               - main thread finished early
Thread[demo,5,main] - 5
demo thread finished
*/


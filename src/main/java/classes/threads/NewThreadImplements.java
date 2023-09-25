package classes.threads;

class DemoThread2 implements Runnable {
	Thread t;
	
	DemoThread2() {
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

public class NewThreadImplements {

	public static void main(String[] args) {
		new DemoThread2();

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
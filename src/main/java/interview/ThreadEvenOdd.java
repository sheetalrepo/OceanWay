package interview;

public class ThreadEvenOdd implements Runnable {

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {
			synchronized (this) {
				String currentThreadName = Thread.currentThread().getName();
				if (i % 2 == 0 && currentThreadName.equals("even")) {
					printMe(currentThreadName, i);
				} else if (i % 2 != 0 && currentThreadName.equals("odd")) {
					printMe(currentThreadName, i);
				}
			}
		}
	}

	private void printMe(String currentThreadName, int i ) {
		try {
			notifyAll();
			System.out.println(currentThreadName+" : " + i);
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
	
	public static void main(String[] args) {
		ThreadEvenOdd obj = new ThreadEvenOdd();

		Thread t1 = new Thread(obj);
		t1.setName("odd");
		t1.start();

		Thread t2 = new Thread(obj);
		t2.setName("even");
		t2.start();
	}

}

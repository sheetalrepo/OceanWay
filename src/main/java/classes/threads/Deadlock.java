package classes.threads;

class Mango {

	synchronized public void One(Apple obj2) throws InterruptedException {
		System.out.println("Mango > One : " + Thread.currentThread());
		Thread.sleep(1000);
		System.out.println(Thread.currentThread().getName()+" Calling Apple > Feb");
		obj2.Feb();  // main thread now wants to enter Jan method which is being taken by new thread    -- deadlock
	}

	synchronized public void Two() {
		System.out.println("I am Mango > Two");
	}

}

class Apple {
	synchronized public void Jan(Mango obj1) throws InterruptedException {
		System.out.println("Apple > Jan :" + Thread.currentThread());
		Thread.sleep(1000);
		System.out.println(Thread.currentThread().getName()+" Calling Mango > Two");
		obj1.Two(); // new thread want to enter One method which is being taken by main thread    - deadlock
	}

	synchronized public void Feb() {
		System.out.println("I am Feb");
	}

}

public class Deadlock implements Runnable {

	Mango obj1 = new Mango();
	Apple obj2 = new Apple();

	public Deadlock() throws InterruptedException {
		Thread.currentThread().setName("main");
		Thread t = new Thread(this, "new"); // call run
		t.start();
		// main thread continue
		obj1.One(obj2);
	}

	@Override
	public void run() {
		try {
			obj2.Jan(obj1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			new Deadlock();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

/*

Without sync keyword:

Mango > One : Thread[main,5,main]
Apple > Jan :Thread[new,5,main]
main Calling Apple > Feb
I am Feb
new Calling Mango > Two
I am Mango > Two



With sync keyword:

Mango > One : Thread[main,5,main]
Apple > Jan :Thread[new,5,main]
main Calling Apple > Feb
new Calling Mango > Two

*/

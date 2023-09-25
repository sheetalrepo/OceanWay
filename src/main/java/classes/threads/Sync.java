package classes.threads;

class Callme {
	synchronized void print(String str) {
		System.out.print("[" + str);

		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.print("]");
	}
}

class Caller implements Runnable {
	Thread t;
	Callme c;
	String str;

	Caller(Callme c, String str) {
		this.str = str;
		this.c = c;
		t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		c.print(str);
	}
}

public class Sync {
	public static void main(String[] args) {
		Callme c = new Callme();
		Caller obj1 = new Caller(c, "Hi");
		Caller obj2 = new Caller(c, "Sync");
		Caller obj3 = new Caller(c, "Threads");

		try {
			obj1.t.join();
			obj2.t.join();
			obj3.t.join();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}

/*
[Hi[Sync[Threads]]]    -  w/o synchronized keyword
[Hi][Threads][Sync]    - with synchronized keyword line 4
*/		
		

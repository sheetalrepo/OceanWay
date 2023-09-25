package classes.threads;

public class Basics {

	public static void main(String[] args) {

		Thread t = Thread.currentThread();
		System.out.println("T: " + t); // T: Thread[main,5,main]
		t.setName("mythread");
		t.setPriority(8);
		System.out.println("T: " + t); // T: Thread[mythread,8,main]
		
		for(int i=1;i<=5;i++){
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

package java8.lambdas;

/**
 * Biggest adv: Backward compatibility old code can be run with lambda
 * 
 * Lambda can be used with threads as Runnable is a functional interface
 */
public class D_ThreadWithLambdas {

	public static void main(String[] args) {
		
		//method 1 : old legacy code
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("running in thread mode 1 ...");
			}
		});

		t1.run();
		
		
		//method 2: lambda
		Thread t2 = new Thread(() -> System.out.println("running in thread mode 2 ..."));
		t2.run();


		//method 3: Using interface
		Runnable r3 = () -> System.out.println("running in Runnable mode 3 ...");
		r3.run();

		//method 4: Using interface
		Runnable r4 = () -> {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+ "running in Runnable mode 4 ...");
		};
		r4.run();


	}
}

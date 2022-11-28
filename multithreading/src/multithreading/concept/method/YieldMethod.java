package multithreading.concept.method;

public class YieldMethod extends Thread {

	public void run() {

		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " - " + i);
		}

	}

	public static void main(String[] args) {

		YieldMethod y = new YieldMethod();

		y.start();
        // stop current thread and provide execution to other thread
		Thread.yield();

		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " - " + i);
		}
	}

}

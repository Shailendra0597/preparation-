package multithreading.concept.method;

public class JoinMethod extends Thread {

	public void run() {

		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("child thread : " + i);
				Thread.sleep(1000);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws InterruptedException {

		JoinMethod j = new JoinMethod();

		j.start();

		// wait for child method to complete it first then execute main method
		j.join();
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("main thread : " + i);
				Thread.sleep(1000);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

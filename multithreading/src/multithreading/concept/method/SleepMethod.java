package multithreading.concept.method;


// throws Interrupted Exception 
public class SleepMethod extends Thread {

	public void run() {

		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println("thread after every 3 second: " + i);
		}
	}

	public static void main(String[] args) {

		SleepMethod s = new SleepMethod();
		s.start();
	}

}

package multithreading.concept.method;

public class DaemonThread extends Thread{

	public void run() {
		
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon thread");
		}else {
			System.out.println("Not Daemon thread");
		}
		
	}
	public static void main(String[] args) {

		System.out.println("main thread");
		DaemonThread d=new DaemonThread();
		d.setDaemon(true);
		d.start();
	}

}

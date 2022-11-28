package multithreading.concept.threadPool;

public class MyRunnbaleThreadPool implements Runnable {
	
	String name;
	public MyRunnbaleThreadPool(String name) {
		this.name=name;
	}
	
	public void run() {
		System.out.println("Start thread "+ name);
		try {
			Thread.sleep(1000);
			
		}catch (Exception e) {
            e.printStackTrace();
		}
		System.out.println("End Thread "+ name);
	}

}

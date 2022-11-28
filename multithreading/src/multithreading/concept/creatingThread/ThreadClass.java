package multithreading.concept.creatingThread;

public class ThreadClass extends Thread{
	
	@Override
	public void run() {
		
		System.out.println("Thread is running");
	}
	
	public static void main(String[] args) {
		
		ThreadClass t=new ThreadClass();
		t.start();
		
	}

}

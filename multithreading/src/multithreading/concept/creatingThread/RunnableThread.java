package multithreading.concept.creatingThread;

public class RunnableThread implements Runnable{
   
	@Override
	public void run() {
		System.out.println("thread is running using runnable thread");
	}
	public static void main(String[] args) {
		
		RunnableThread r=new RunnableThread();
		
		Thread t=new Thread(r);
		t.start();

	}

}

package multithreading.concept.synchronization;

class First {

	synchronized void display(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}

}

class Second extends Thread {

	String msg;
	First fobj;

	Second(String msgg, First fobjj) {
		msg = msgg;
		fobj = fobjj;
		start();
	}

	public void run() {
		fobj.display(msg);
	}

}

public class SynchronizationMethod {

	public static void main(String[] args) {
		First fnew = new First();
		Second s1 = new Second("shailendra", fnew);
		Second s2 = new Second("singh", fnew);
		Second s3 = new Second("Rajawat", fnew);

	}

}

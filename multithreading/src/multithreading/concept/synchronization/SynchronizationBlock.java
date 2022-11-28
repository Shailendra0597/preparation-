package multithreading.concept.synchronization;

class Fir {

	void display(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}

}

class Sec extends Thread {

	String msg;
	Fir fobj;

	Sec(String msgg, Fir fobjj) {
		msg = msgg;
		fobj = fobjj;
		start();
	}

	public void run() {
		synchronized (fobj) {

			fobj.display(msg);
		}
	}

}

public class SynchronizationBlock {

	public static void main(String[] args) {
		Fir fnew = new Fir();
		Sec s1 = new Sec("shailendra", fnew);
		Sec s2 = new Sec("singh", fnew);
		Sec s3 = new Sec("Rajawat", fnew);

	}

}

package DesignPatternConcept.patternExample.Singleton;

// lazy loading class
public class Singleton {
	private Singleton() {

	}

	private String message="";
	
	private static Singleton instance;

	// making static so that other class can this method without object
	public static Singleton getInstance() {

		// checking an object is created or not

		// if you want to synchronized it using static block
		synchronized (Singleton.class) {
			if (instance == null) {
				instance = new Singleton();
			}
		}
		return instance;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message=message;
	}
}

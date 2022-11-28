package DesignPatternConcept.patternExample.Singleton;

public class EagerSingleton {

	// instance is created in jvm during start of the application

	private static final EagerSingleton singletonInst = new EagerSingleton();

	private String message = "";

	private EagerSingleton() {

	}

	public static EagerSingleton getInstance() {
		return singletonInst;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}

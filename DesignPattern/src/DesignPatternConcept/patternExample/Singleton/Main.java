package DesignPatternConcept.patternExample.Singleton;

public class Main {
	public static void main(String[] args) {
		
		Singleton s=Singleton.getInstance();
		s.setMessage("hello");
		display();
	}

	private static void display() {
		Singleton s=Singleton.getInstance();
	    System.out.println(s.getMessage());
		
	}

}

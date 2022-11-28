package ExceptionConcept.HandlingMethod;

public class YoungGen extends Exception {

	String message;

	public YoungGen(String str) {

		 message=str;
	}

	public String toString() {
		return ("this is young gen exception:" + message);
	}

}

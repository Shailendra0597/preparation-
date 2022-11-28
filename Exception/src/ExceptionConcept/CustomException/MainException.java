package ExceptionConcept.CustomException;

public class MainException {

	public static void main(String[] args) {

		try {
			throw new CustomException("This is custom exception");

		} catch (CustomException e) {
			System.out.println(e);

		}
	}

}

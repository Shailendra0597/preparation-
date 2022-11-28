package finalExample;

public class FinalExampleOfVariable {

	final int id;

	public FinalExampleOfVariable(int studentId) {
		id = studentId;
	}

	void getDetails() {
		System.out.println("student id " + id);
	}

	public static void main(String[] args) {
		FinalExampleOfVariable f = new FinalExampleOfVariable(14);

		f.getDetails();

	}
}
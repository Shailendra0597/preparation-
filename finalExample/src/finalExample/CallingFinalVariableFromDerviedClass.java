package finalExample;

public class CallingFinalVariableFromDerviedClass {

	public static void main(String[] args) {

		BaseClass b = new DerviedClass(5);

	}

}

abstract class BaseClass {
	final int finalVariable;

	public BaseClass(int finVar) {
		this.finalVariable = finVar;
	}

}

class DerviedClass extends BaseClass {

	public DerviedClass(int finVar) {
		super(finVar);
		System.out.println("Dervied class here : " + finVar);

	}
}
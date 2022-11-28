package ExceptionConcept.HandlingMethod;

public class TryCatchExample {
	public static void main(String[] args) {
		
		int a=10,b=0;
		
		int c;
		
		try {
			c=a/b;
			
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		

	}
}
import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		System.out.println("enter  array size");
		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();

		int[] arr = new int[arraySize];

		System.out.print("enter array value: ");
		for (int i = 0; i < arraySize; i++) {
			arr[i] = sc.nextInt();
		}

		// int[] arr= {1,2,3,5};
		int n = arr.length + 1; // because expected number would not be 4 but it will be 5

		int expected = n * (n + 1) / 2;

		int sumArrayTotal = 0;
		for (int ar : arr) {
			sumArrayTotal += ar;
		}

		int missingNumber = expected - sumArrayTotal;

		System.out.println("missing number: " + missingNumber);
	}

}


//Time complexity- O(n)
// space complexity- O(1)

public class LargestAndSecondLargest {

	public static void main(String[] args) {

		int[] arr = { 1, 20, 40, 12, 32 };

		largestandSecondLargest(arr);
	}

	public static void largestandSecondLargest(int[] arr) {
		int largestNumber = Integer.MIN_VALUE;

		int secondLagestNumber = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largestNumber) {

				secondLagestNumber = largestNumber;
				largestNumber = arr[i];
				
			} else if (arr[i] > secondLagestNumber && arr[i] != largestNumber) {
				secondLagestNumber = arr[i];
			}
		}

		System.out.println("second largest: " + secondLagestNumber);
	}

}

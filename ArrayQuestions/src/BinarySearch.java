
public class BinarySearch {

	
	// Time complexity O(log n)
	// space complexity O(1)
	public static void main(String[] args) {

		int[] arr = { 2, 5, 7, 9, 10, 11 };

		int findNumber = 10;

		int first = 0;
		int last = arr.length - 1;

		int mid = (first + last) / 2;

		while (first <= last) {

			if (arr[mid] == findNumber) {
				System.out.println("found number " + mid);
				break;
			} else if (arr[mid] < findNumber) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("not found");
		}
	}
}

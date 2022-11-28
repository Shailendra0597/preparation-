package Arrays;

public class MaxValue {

	public static void main(String[] args) {
		int[] arr = { 1, 7, 5, 120, 10 };

		// highest value in array
		System.out.println(max(arr));

		// highest value between range
		System.out.println(maxValueRange(arr, 1, 3));
	}

	private static int max(int[] array) {

		if (array.length == 0) {
			return -1;
		}

		int max = array[0];

		for (int i = 1; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}

		return max;
	}

	static int maxValueRange(int[] array, int start, int end) {

		if (end > start) {
			return -1;
		}
		if (array == null) {
			return -1;
		}
		int max = array[start];

		for (int i = start; i < end; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}

		return max;
	}

}

import java.util.HashMap;
import java.util.Map;

public class SumOfPairEqualToGivenNumber {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 5, 3, 3, 1 };

		int sum = 6;

		sumOfPairEqualToGivenNumber(arr, sum);
		sumOfPairEqualToGivenNumberUsingUnorderedMap(arr,sum);
	}

	//Time complexity- O(n)
		// space complexity- O(n)
	private static void sumOfPairEqualToGivenNumberUsingUnorderedMap(int[] arr, int sum) {
		
		Map<Integer,Integer> map=new HashMap<>();
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(sum-arr[i])) {
				count+=map.get(sum-arr[i]);
			}
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]+1));
			}else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(count);
		
	}


	//Time complexity- O(n square)
	// space complexity- O(1)
	public static void sumOfPairEqualToGivenNumber(int[] arr, int sum) {
		// int count=0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					System.out.print("{" + arr[i] + "," + arr[j] + "}" + " ");
					// count++; }

				}

			}

			// System.out.println(count);

		}

	}

}

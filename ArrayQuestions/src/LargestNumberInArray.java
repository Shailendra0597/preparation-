

//Time complexity- O(n)
// space complexity- O(1)
public class LargestNumberInArray {

	public static void main(String[] args) {

		int[] arr= {1,5,7,10,2};
		
		System.out.println(largestNumber(arr));
	}
	
	public static int largestNumber(int[] arr) {
		
		int maxValue=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxValue) {
				maxValue=arr[i];
			}
		}
		
		return maxValue;
	}

}

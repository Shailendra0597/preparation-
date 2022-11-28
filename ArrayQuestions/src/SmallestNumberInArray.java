
public class SmallestNumberInArray {
	public static void main(String[] args) {
	int[] arr= {1,5,7,10,2};
		
		System.out.println(smallestNumber(arr));
		
	}
	
public static int smallestNumber(int[] arr) {
		
		int minValue=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<minValue) {
				minValue=arr[i];
			}
		}
		
		return minValue;
	}

}

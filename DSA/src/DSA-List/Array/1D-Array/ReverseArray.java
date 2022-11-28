package Arrays;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		
		int[] arr = { 1, 7, 5, 120, 10 };
		
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

}

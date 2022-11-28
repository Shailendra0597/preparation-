package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDayArray {

	public static void main(String[] args) {

		int[][] arr = new int[3][3];
		
		Scanner sc=new Scanner(System.in);
		
		
		// input
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				arr[row][col]=sc.nextInt();
			}
		}
		
		//output 
//		for(int row=0;row<arr.length;row++) {
//			for(int col=0;col<arr[row].length;col++) {
//				System.out.print(arr[row][col]+" ");
//			}
//			
//			System.out.println();
//		}
//		
		// to string method 
		// output
		
//		for(int row=0;row<arr.length;row++) {
//			System.out.println(Arrays.toString(arr[row]));
//		}
		
		//enhanced for loop
		
		for(int[] a:arr) {
			System.out.println(Arrays.toString(a));
		}
		
	}

}

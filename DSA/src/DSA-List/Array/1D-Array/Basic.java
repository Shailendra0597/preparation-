package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {

		int[] array; // declaration of array: array is defined in the stack
		array=new int[5];// Initialization : object is being created in memory(heap)
		
		int[] arr=new int[5];
		
		Scanner sc=new Scanner(System.in); 
		
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//			
//		}
		
		int[] arrays= {5,6,7,4};
//		for(int arrays:arr) {
//			System.out.print(arrays+" ");
//		}
//		
		System.out.println(Arrays.toString(arrays));
		
		change(arrays);
		System.out.println(Arrays.toString(arrays));
		
		
	}

       private static void change(int[] num) {
    	   num[0]=12;
    	   
       }

}

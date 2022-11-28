import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	
	//Time complexity- O(n)
	// space complexity- O(1)
	public static void main(String[] args) {

		int[] arr = { 1, 3, 4, 4, 5, 9, 9 };
	
		/*
		 * int j=0;
		 * 
		 * for(int i=0;i<arr.length-1;i++) { if(arr[i]!=arr[i+1]) { arr[j]=arr[i]; j++;
		 * } }
		 * 
		 * arr[j]=arr[arr.length-1];
		 * 
		 * for(int i=0;i<=j;i++) { System.out.print(arr[i]+" "); }
		 */
		/******************/
		// using HashSet  works for sorted as well as for non sorted array
		
	    Set<Integer> set=new HashSet<Integer>();
	    for(int i=0;i<arr.length;i++) {
	    	set.add(arr[i]);
	    }
	    
	    for(int setValue:set) {
	    	System.out.print(setValue+" ");
	    }
	    
	}

}

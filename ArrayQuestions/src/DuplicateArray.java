import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateArray {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 4, 4, 5, 9, 9 };

		
		// Time complexity - O(n square)
		// space complexity - O(1)
		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					System.out.print(arr[j] +" ");
//				}
//			}
//		}
		
		// Time complexity - O(n)
		// space complexity - O(n)
//		Map<Integer,Integer> map=new HashMap<>();
//		for(int i=0;i<arr.length;i++) {
//			if(map.containsKey(arr[i])) {
//				map.put(arr[i], map.get(arr[i])+1);
//			}else {
//				map.put(arr[i], 1);
//			}
//		}
//		
//		for(Entry<Integer,Integer> entry:map.entrySet()) {
//			if(entry.getValue()>1) {
//				System.out.print(entry.getKey()+" ");
//			}
//		}
		
		
		// Time complexity - O(1)
		// space complexity - O(n)
		
//		List<Integer> res=new ArrayList<>();
//		for(int i=0;i<arr.length;++i) {
//			int index=Math.abs(arr[i]);
//			if(arr[index]<0) {
//				res.add(Math.abs(arr[i]));
//				arr[index]=-arr[index];
//			}
//			System.out.println(res);
//		}
//		
	}

}

import java.util.HashMap;
import java.util.Map;

public class MakeEvenStringByRemovingLetter {

	public static void main(String[] args) {

		String s="aabbbcc";   //a=2,b=3,c=2 so now b should be deleted once to make it string even// output:1
		int count=0;
		Map<Character, Integer> map=new HashMap<>();
		
		for(char c:s.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> e:map.entrySet()){
			if(e.getValue()%2!=0) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}

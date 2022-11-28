import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatedCharacterInString {

	public static void main(String[] args) {

		// Time complexity - O(n)
		
		// Space complexity -O(1)
		
		String str="abbcadd shailendra";
		
		Map<Character, Integer> mapCOunt=new LinkedHashMap<>();
		
		for(char c:str.toCharArray()) {
			if(mapCOunt.containsKey(c)) {
				mapCOunt.put(c, mapCOunt.get(c)+1);
			}else {
				mapCOunt.put(c, 1);
			}
		}
		
		for(Map.Entry<Character,Integer> entry:mapCOunt.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
				break;
			}
		}
		
	}

}

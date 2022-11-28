import java.util.HashSet;
import java.util.Set;

public class UniqueCharacterInString {

	public static void main(String[] args) {

		String s="my name is shailendraa";
		
//		Map<Character,Integer> mapCount=new HashMap<>();
//		
//		for(char c:s.toCharArray()) {
//			if(mapCount.containsKey(c)) {
//				mapCount.put(c, mapCount.get(c)+1);
//			}else {
//				mapCount.put(c, 1);
//			}
//		}
//		
//		for(Map.Entry<Character,Integer> entry:mapCount.entrySet()) {
//			if(entry.getKey()>1) {
//				System.out.println("Not unique");
//				break;
//			}
//		}
		
	//	Using set
		Set<Character> set=new HashSet<>();
		
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		
		if(set.size()==s.length()) {
			System.out.println("unique");
		}else {
			System.out.println("Not unique");
		}
	}

}

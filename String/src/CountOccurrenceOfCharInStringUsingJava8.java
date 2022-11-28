import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountOccurrenceOfCharInStringUsingJava8 {

	public static void main(String[] args) {

		String s="cceraabbccdddeefgg";
		
		/**On the bases of random order **/
		
//		Stream.of(s.toLowerCase().split(""))
//		.collect(Collectors.groupingBy(e->e,Collectors.counting()))
//		.entrySet().stream().map(e->e.getKey()+"="+e.getValue()+",").forEach(System.out::print);
		
		
		/** On the bases of occurrence in string**/
		
//		Stream.of(s.toLowerCase().split(""))
//		.collect(Collectors.groupingBy(e->e,LinkedHashMap::new,Collectors.counting()))
//		.entrySet().stream().map(e->e.getKey()+"="+e.getValue()+",").forEach(System.out::print);
//		
		
		/**   On the bases of alphabetical order    */
//		Stream.of(s.toLowerCase().split(""))
//		.collect(Collectors.groupingBy(e->e,Collectors.counting()))
//		.entrySet().stream().sorted(Map.Entry.comparingByKey()).map(e->e.getKey()+" "+e.getValue())
//		.forEach(System.out::print);
		
	}

}

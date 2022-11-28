import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurrenceOfWordInStringUsingJava8 {

	public static void main(String[] args) {

		String s="hello hello shai shai home";
		
		List<String> list=Arrays.asList(s.split(" "));
		
		
		Map<String,Long> count=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	     System.out.println(count);
	}

}

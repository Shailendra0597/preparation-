package CollectionConcept.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		map.put("shailendra", 20);
		map.put("adu", 10);
		map.put("viku", 30);

		System.out.println(map.size());

		if (map.containsKey("shailendra")) {
			int n = map.get("shailendra");

			System.out.println(n);
		}

	}

}

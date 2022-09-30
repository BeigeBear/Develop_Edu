package HashMapExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		
		map.put("임재영", 80);
		map.put("허민", 85);
		map.put("안재민", 86);
		map.put("권오기", 99);
		map.put("김호중", 100);
		map.put("박준우", 90);
		System.out.println("총 Entry 수 : " + map.size());
		
		System.out.println("\t임재영 : " + map.get("임재영"));
		System.out.println();
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		map.remove("권오기");
		System.out.println("총 Entry 수 : " + map.size());

		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIteartor = entrySet.iterator();
		
		while(entryIteartor.hasNext()) {
			Map.Entry<String, Integer> entry = entryIteartor.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		map.clear();
		System.out.println("총 Entry 수 : " + map.size());

		
		
	}

}

package settimana09.es_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Esercizio {
	public static void main(String[] args) {
		TreeMap <String, Integer> map = new TreeMap<>();
		map.put("g", 7);
		map.put("A", 1);
		map.put("h", 8);
		map.put("B", 2);
		map.put("i", 9);
		map.put("c", 3);
		map.put("f", 6);
		map.put("e", 5);
		map.put("d", 4);
		
		System.out.println(map);	
		
		
		TreeMap<Integer, String> mapReverse = new TreeMap<>();
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			mapReverse.put(entry.getValue(), entry.getKey());
		}
		
		System.out.println(mapReverse);
	}
}

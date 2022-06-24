package settimana09.es_04;

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
		
		String S = "d";
		
		List<Integer> lista = new ArrayList<>();
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getKey().compareTo(S)<= 0) {
				lista.add(entry.getValue());
			}
		}
		
		System.out.println(lista);
		
		System.out.println(map.subMap("B", "f"));
			
	}
}

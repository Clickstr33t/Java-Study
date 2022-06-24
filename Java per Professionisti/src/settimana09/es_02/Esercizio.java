package settimana09.es_02;

import java.util.Map;
import java.util.TreeMap;

public class Esercizio {
	public static void main(String args []) {
		 Map<String, Integer> map = new TreeMap<>();
		 map.put("Didomenico", 1);
		 map.put("Paffi", 2);
		 map.put("Cartesio", 3);
		 
		 int cerca = 4;
		 String trova = "$*!";
		 
		 for (Map.Entry<String, Integer> entry: map.entrySet()) {
			 if (entry.getValue() == cerca) {
				 trova = entry.getKey();
				 System.out.println(trova);
			 } 
		 }
		 if (trova == "$*!") {
			 System.out.println("Valore non presente in map!");
		 }
	}

}

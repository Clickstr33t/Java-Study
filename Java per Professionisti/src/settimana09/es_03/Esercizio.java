package settimana09.es_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Esercizio {
	public static void main(String[] args) {
		String[] array = {"zero", "uno", "due", "tre", "quattro", "cinque"};
		System.out.println(Arrays.toString(array));
		
		List<String> testList = arrayToList(array);
		System.out.println(testList);
		
		Set<String> testSet = arrayToSet(array);
		System.out.println(testSet);
		
		Collection[] testCollection = arrayToCollection(array);
		for (Collection collection : testCollection) {
			System.out.println(collection.toString());
		}
		
	}

	public static List<String> arrayToList (String[] array) {
		List<String> lista = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			lista.add(array[i]);
		}
		return lista;
	}
	
	public static Set<String> arrayToSet (String[] array){
		Set<String> set = new HashSet<>();
		for (int i = 0; i < array.length; i++) {
			set.add(array[i]);
		}
		return set;
	}
	
	public static Collection[] arrayToCollection (String[] array){
		Collection[] collection = new Collection[array.length];
		for (int i = 0; i < array.length; i++) {
			collection[i]=new ImplementCollection(array[i]);
		}
		return collection;
	}
}


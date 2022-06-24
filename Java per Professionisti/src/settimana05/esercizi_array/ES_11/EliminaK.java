package settimana05.esercizi_array.ES_11;

import java.util.Arrays;

public class EliminaK {
	public static void main(String[] args) {
		int[] array = {3,3,3,3,3};
		int k = 3;
		
		System.out.println(Arrays.toString(array));
		eliminaTuttiIK(array, k);
		System.out.println(Arrays.toString(array));
		
	}
	
	public static void eliminaK (int[] array, int k) {
		boolean kSwitch = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i]==k && kSwitch == false) {
				kSwitch=true;
				i++;
			}
			if (kSwitch == true) {
				array[i-1]=array [i];
			}
			}
			if (kSwitch = true) {
				array[array.length-1]=-1;
		}
	}
	
	public static void eliminaTuttiIK (int[] test, int k) {
		boolean kSwitch;
		do {
			kSwitch = false;
			for (int i = 0; i < test.length; i++) {
				if (test[i]==k && kSwitch == false) {
					kSwitch=true;
					i++;
				}
				if (kSwitch == true) {
					test[i-1]=test [i];
				}
				}
				if (kSwitch == true) {
					test[test.length-1]=-1;
				}
		}while(kSwitch == true);
	}

}

package settimana05.esercizi_array.ES_01;

public class ArrayFloat {
	public static void main(String[] args) {
		float [] array = {6,2,8,2,4};
		float k = 7;
		System.out.println(isInTheArray(k, array));
	}
	
	public static boolean isInTheArray(float numInput, float[] arrayInput) {
		for (int i=0; i< arrayInput.length; i++) {
			if (arrayInput[i]==numInput) {
				return true;
			}
		}
		return false;
	}

}

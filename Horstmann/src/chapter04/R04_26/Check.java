package chapter04.R04_26;

public class Check {
	public static void main(String[] args) {
		String text = "Gateway";
		int i = 2;
		int j = 4;
		String first, charI, middle, charJ, last;
		
		first = text.substring(0, i);
		charI = text.substring(i,i+1);
		middle = text.substring(i+1, j);
		charJ = text.substring(j, j+1);
		last = text.substring(j+1);
		
		System.out.println(first+charI+middle+charJ+last);
	}

}

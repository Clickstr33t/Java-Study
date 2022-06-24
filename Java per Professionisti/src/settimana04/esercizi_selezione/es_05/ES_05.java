package settimana04.esercizi_selezione.es_05;

public class ES_05 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int d = Integer.parseInt(args[3]);
		int e = Integer.parseInt(args[4]);
		int f = Integer.parseInt(args[5]);
		int g = Integer.parseInt(args[6]);
		
		int min = a;
		int mag = a;
		
		if (b>mag) mag =b;
		if (c>mag) mag =c;
		if (d>mag) mag =d;
		if (e>mag) mag =e;
		if (f>mag) mag =f;
		if (g>mag) mag =g;
		
		if (b<min) min =b;
		if (c<min) min =c;
		if (d<min) min =d;
		if (e<min) min =e;
		if (f<min) min =f;
		if (g<min) min =g;
		
		System.out.println("Mag = "+mag);
		System.out.println("Min = "+min);

		
	}
}

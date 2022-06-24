package settimana04.esercizi_iterazione.es_05;

public class ES_05 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int i = 1;
		
		while(i<=a) {
			String day = "";
			switch (b) {
			case 0: day = "Lun";
			break;
			case 1: day = "Mar";
			break;
			case 2: day = "Mer";
			break;
			case 3: day = "Gio";
			break;
			case 4: day = "Ven";
			break;
			case 5: day = "Sab";
			break;
			case 6:	day = "Dom";
			break;
			}
			System.out.println(day + " " + i); 
			i++;
			b++;
			if (b==7) {b=0;};
		}
		
	}

}

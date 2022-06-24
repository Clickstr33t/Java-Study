package settimana06.esercizi_classe_e_oggetti.es_01;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date (int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		
		if (year < 0) {
			System.out.println("L'anno deve essere maggiore di 0");
		}else if (month <1 || month >12){
			System.out.println("Il mese deve essere compreso tra 1 e 12");
		}else if (day < 1) {
			System.out.println("Il giorno deve essere maggiore di 0");
		/*controllo mese di febbraio anno bisestile*/
		}else if (month == 2) {
				if(day > 29 && (year % 400 ==  0 || (year %4 == 0 && !(year % 100 == 0)))) {
						System.out.print("Febbraio non può avere + di 29 giorni");
				}else if(day > 28) {
						System.out.print("Febbraio non può avere più di 28 giorni");
				}
		/*Controllo mesi di 31 giorni*/
		}else if ( (month == 1 ||
					month == 3 ||
					month == 5 ||
					month == 7 ||
					month == 8 ||
					month == 10||
					month == 12)
					&& day > 31){
			System.out.println("Il mese non può avere più di 31 giorni");
		/* Controllo mesi di 30 giorni*/
		}else if(  (month == 4 ||
					month == 6 ||
					month == 9 ||
					month == 11)
					&& day > 30){
			System.out.println("Il mese non può avere piu di 30 giorni");
		}
		else {
			System.out.println(day+"/"+month+"/"+year);
		}
	}
}

package settimana08.esercizi.es_03;

import settimana08.esercizi.es_03.eccezioni.InvalidDayException;
import settimana08.esercizi.es_03.eccezioni.InvalidMonthException;
import settimana08.esercizi.es_03.eccezioni.InvalidYearException;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date (int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		
		if (year <= 0) {
			throw new InvalidYearException();
		}else if (month <1 || month >12){
			throw new InvalidMonthException(month);
		}else if (day < 1) {
			throw new InvalidDayException(day, month);
		/*controllo mese di febbraio anno bisestile*/
		}else if (month == 2) {
				if(day > 29 && (year % 400 ==  0 || (year %4 == 0 && !(year % 100 == 0)))) {
					throw new InvalidDayException(day, month); 
				}else if(day > 28) {
					throw new InvalidDayException(day, month);
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
			throw new InvalidDayException(day, month);
		/* Controllo mesi di 30 giorni*/
		}else if(  (month == 4 ||
					month == 6 ||
					month == 9 ||
					month == 11)
					&& day > 30){
			throw new InvalidDayException(day, month);
		}
		else {
			System.out.println(day+"/"+month+"/"+year);
		}
	}
}

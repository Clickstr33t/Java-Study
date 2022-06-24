package settimana06.esercizi_classe_e_oggetti.es_05;

import java.util.Scanner;

public class Menu {
	private static Guardie guardie = new Guardie(100);
	private static Criminali criminali = new Criminali (100);
	private static ArchivioFascicoli fascicoli = new ArchivioFascicoli(100);
	
	public static void main (String[] args) {
		stampaMenu();
		Scanner s = new Scanner(System.in);
		int choise = 0;
		
		do {
			choise = -1;
			System.out.print("Inserisci la tua scelta: ");
			do {
				if (s.hasNextInt()) {
					choise = s.nextInt();
				}
				else {
					System.out.print("Inserisci una voce del menu valida: ");
					s.next();
				}
				
			}
			while(choise == -1);
			switch (choise) {
			case 0: stampaMenu();
			break;
			case 1: System.out.println("AZZERA GUARDIA");
					azzeraGuardie(s);
			break;
			case 2: System.out.println("AGGIUNGI GUARDIA");
					aggiungiGuardia(nuovaScheda(s));
			break;
			case 3: System.out.println("RIMUOVI GUARDIA");
					rimuoviGuardia(s);
			break;
			case 4: System.out.println("AZZERA CRIMINALI");
					azzeraCriminali(s);
			break;
			case 5: System.out.println("AGGIUNGI CRIMINALI");
					aggiungiCriminale(nuovaScheda(s));
			break;
			case 6: System.out.println("RIMUOVI GUARDIE:");
					rimuoviGuardia(s);
			break;
			case 7: System.out.println("AZZERA FASCICOLI");
					azzeraFascicoli(s);
			break;
			case 8: System.out.println("AGGIUNGI FASCICOLI");
					aggiungiFascicolo(nuovoFascicolo(s));
			break;
			case 9: System.out.println("RIMUOVI FASCICOLI");
					rimuoviFascicoli(s);
			break;
			case 10:System.out.println("CERCA FASCICOLO PER NOME");
					cercaFascicolo(s);
			break;
			case 11:System.out.println("VISUALIZZA N° MORTI");
					criminali.getMorti();
			break;
			case 12:System.out.println("VISUALIZZA N° EVASI");
					criminali.getEvasi();
			break;
			case 13:System.out.println("STAMPA TUTTE LE GUARDIE");
					guardie.stampaGuardie();
			break;
			case 14:System.out.println("STAMPA TUTTI I CRIMINALI");
					criminali.stampaCriminali();
			break;
			case 15:System.out.println("STAMPA TUTTI I FASCICOLI");
					fascicoli.stampaTuttiFascicoli();
			break;
			case 16:System.out.println("AGGIUNGI EVASO DA INDICE"); 
					aggiungiEvaso(s);
			break;
			case 17:System.out.println("AGGIUNGI MORTO DA INDICE"); 
			aggiungiEvaso(s);
			break;
			case 20:System.out.println("Grazie per aver usato il nostro software2".toUpperCase());
			break;
			default:System.out.println("Esegui una voce valida del menu".toUpperCase());
			break;
			}
		}
		while(choise != 20);
		
		s.close();
	}
	
	public static void stampaMenu() {
		System.out.println(""
				+ "MENU:"
				+ "\n"
				+ "\n 0) MENU"
				+ "\n 1) AZZERA GUARDIE"
				+ "\n 2) AGGUNGI GUARDIA"
				+ "\n 3) RIMUOVI GUARDIA"
				+ "\n 4) AZZERA CRIMINALI"
				+ "\n 5) AGGIUNGI CRIMINALE"
				+ "\n 6) RIMUOVI CRIMINALE"
				+ "\n 7) AZZERA FASCICOLI"
				+ "\n 8) AGGIUNGI FASCICOLO"
				+ "\n 9) RIMUOVI FASCICOLO"
				+ "\n10) CERCA FASCICOLO PER NOME"
				+ "\n11) VISUALIZZA N° MORTI"
				+ "\n12) VISUALIZZA N° EVASI"
				+ "\n13) STAMPA TUTTI LE GUARDIE"
				+ "\n14) STAMPA TUTTI I CRIMINALI"
				+ "\n15) STAMPA TUTTI I FASCICOLI"
				+ "\n16) AGGIUNGI EVASO DA INDICE"
				+ "\n17) AGGIUNGI MORTO DA INDICE"
				+ "\n20) ESCI");
	}
	
	public static void azzeraGuardie(Scanner s) {
		int choise = 0;
		do {
			System.out.print("Inserisci la grandezza del database: ");
			if (s.hasNextInt()) {
				choise = s.nextInt();
				guardie = new Guardie(choise);
				
			}
			else {
				s.next();
			}
		}
		while(choise == 0);
	}
	
	public static void azzeraCriminali(Scanner s) {
		int choise = 0;
		do {
			System.out.print("Inserisci la grandezza del database: ");
			if (s.hasNextInt()) {
				choise = s.nextInt();
				criminali = new Criminali(choise);
			}
			else {
				s.next();
			}
		}
		while(choise == 0);
	}
	
	public static void azzeraFascicoli(Scanner s) {
		int choise = 0;
		do {
			System.out.print("Inserisci la grandezza del database: ");
			if (s.hasNextInt()) {
				choise = s.nextInt();
				fascicoli = new ArchivioFascicoli(choise);
			}
			else {
				System.out.print("Inserisci una valida voce del menu (0 per l'elenco): ");
				s.next();
			}
		}
		while(choise == 0);
	}
	
	public static SchedaAnagrafica nuovaScheda (Scanner s) {
		System.out.print("Inserisci nome: ");
		String nome = s.next();
		System.out.print("Inserisci cognome: ");
		String cognome = s.next();
		System.out.print("Inserisci data di nascita: ");
		String dataNascita = s.next();
		System.out.print("Inserisci numero di telefono: ");
		String numeroTelefono = s.next();
		SchedaAnagrafica scheda = new SchedaAnagrafica(nome, cognome, dataNascita, numeroTelefono);
		return scheda;
	}
	
	public static void aggiungiGuardia (SchedaAnagrafica nuovaScheda) {
		guardie.aggiungiNuovaGuardia(nuovaScheda);
	}
	
	public static void aggiungiCriminale (SchedaAnagrafica nuovaScheda) {
		criminali.aggiungiNuovoCriminale(nuovaScheda);
	}
	
	public static Fascicolo nuovoFascicolo (Scanner s) {
		System.out.print("Inserisci ID del criminale: ");
		String idCriminale = s.next();
		System.out.print("Inserisci nome: ");
		String nome = s.next();
		System.out.print("Inserisci cognome: ");
		String cognome = s.next();
		System.out.print("Inserisci data di carcerazione: ");
		String dataCarcerazione = s.next();
		System.out.print("Inserisci data di scarcerazione: ");
		String dataScarcerazione = s.next();
		System.out.print("Inserisci crimine: ");
		String crimineCommesso = s.next();
		Fascicolo nuovo = new Fascicolo(idCriminale, nome, cognome, dataCarcerazione, dataScarcerazione, crimineCommesso);
		return nuovo;
	}
	
	public static void aggiungiFascicolo (Fascicolo nuovoFascicolo) {
		fascicoli.aggiungiNuovoFascicolo(nuovoFascicolo);
	}
	
	public static void rimuoviGuardia (Scanner s) {
		int choise = 0;
		do {
			if (s.hasNextInt()) {
				System.out.print("Inserisci indice guardia: ");
				choise = s.nextInt();
			}
			else {
				s.next();
			}
		}
		while (choise == 0);
		guardie.rimuoviGuardia(choise);
	}
	
	public static void rimuoviCriminali (Scanner s) {
		int choise = 0;
		do {
			if (s.hasNextInt()) {
				System.out.print("Inserisci indice criminale: ");
				choise = s.nextInt();
			}
			else {
				s.next();
			}
		}
		while (choise == 0);
		criminali.rimuoviCriminale(choise);
	}
	
	public static void rimuoviFascicoli (Scanner s) {
		int choise = 0;
		do {
			if (s.hasNextInt()) {
				System.out.print("Inserisci codice fascicolo: ");
				choise = s.nextInt();
			}
			else {
				s.next();
			}
		}
		while (choise == 0);
		fascicoli.rimuoviFascicolo(choise);
	}
	
	public static void cercaFascicolo (Scanner s) {
		System.out.print("Inserisci il nome: ");
		String nome = s.next();
		System.out.print("Inserisci il cognome: ");
		String cognome = s.next();
		fascicoli.stampaFascicoliNomeCognome(nome, cognome);
	}
	
	public static void aggiungiEvaso (Scanner s) {
		int choise = 0;
		do {
			if (s.hasNextInt()) {
				System.out.print("Inserisci indice evaso: ");
				choise = s.nextInt();
			}
			else {
				s.next();
			}
		}
		while (choise == 0);
		criminali.setEvasi();
		criminali.rimuoviCriminale(choise);
	}
	
	public static void aggiungiMorto (Scanner s) {
		int choise = 0;
		do {
			if (s.hasNextInt()) {
				System.out.print("Inserisci indice morto: ");
				choise = s.nextInt();
			}
			else {
				s.next();
			}
		}
		while (choise == 0);
		criminali.setMorti();
		criminali.rimuoviCriminale(choise);
	}
}

package settimana06.esercizi_classe_e_oggetti.es_04;

import java.util.Scanner;

public class Menu {
	private static ListaContatti lista;
	private static Contatto nuovoContatto;
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int choise = 0;
		lista = new ListaContatti(10);
		
		System.out.print(
				"MENU:\n\n"
				+ "0) MENU\n"
				+ "1) INIZIALIZZA UNA NUOVA LISTA (default lunghezza 10)\n"
				+ "2) INSERISCI UN NUOVO CONTATTO NELLA LISTA\n"
				+ "3) CANCELLA UN CONTATTO DALLA LISTA\n"
				+ "4) MODIFICA INDICE\n"
				+ "5) STAMPA LISTA COMPLETA\n"
				+ "6) CERCA NOME E COGNOME\n"
				+ "7) ESCI\n\n");
		
		do {
			System.out.print("\nINSERISCI NUMERO SCELTA: ");
			if (s.hasNextInt()) {
				choise = s.nextInt();
			}
			else {
				choise = 0;
				s.next();
			}
			switch(choise) {
				case 0: System.out.print(
						"\n\nMENU:\n\n"
						+ "0) MENU\n"
						+ "1) INIZIALIZZA UNA NUOVA LISTA (default lunghezza 10)\n"
						+ "2) INSERISCI UN NUOVO CONTATTO NELLA LISTA\n"
						+ "3) CANCELLA UN CONTATTO DALLA LISTA\n"
						+ "4) MODIFICA INDICE\n"
						+ "5) STAMPA LISTA COMPLETA\n"
						+ "6) CERCA NOME E COGNOME\n"
						+ "7) ESCI\n\n");
				break;
				case 1: initializeArray(s);
				break;
				case 2: addNewContactToList(createNewContact(s));
				break;
				case 3: cancelArrayByIndex(s);
				break;
				case 4: modifyContractByIndex(s);
				break;
				case 5: lista.showList();
				break;
				case 6: searchByName(s);
				break;
				case 7: System.out.println("Grazie per aver usato il nostro software");
				break;
				default: System.out.println("Inserisci una valore del menu valido:");
				break;
						
			}
		}while(choise !=7);
		s.close();
	}
	
	public static void initializeArray (Scanner s) {
		/*INIZIALIZZA UNA LISTA*/
		int arrayLength = -1;
		do {
			System.out.print("Inserisci la grandezza della lista: ");
			if (s.hasNextInt()) {
				arrayLength = s.nextInt();
			}
			else {
				s.next();
			}
		}
		while (arrayLength==-1);
		lista = new ListaContatti(arrayLength);
	}
	
	public static Contatto createNewContact(Scanner s) {
		/*CREA NUOVO CONTATTO*/
		System.out.print("Inserisci il nome:");
		String nome = s.next();
		System.out.print("Inserisci il cognome: ");
		String cognome = s.next();
		System.out.print("Inserisci il numero: ");
		String numero = s.next();
		nuovoContatto = new Contatto(nome, cognome, numero);
		return nuovoContatto;
	}
	
	public static void addNewContactToList(Contatto idContatct) {
		/*AGGIUNGI UN CONTATTO ALLA LISTA*/
		lista.addContact(idContatct);
	}
	
	public static void modifyContractByIndex(Scanner s) {
		/*CREA NUOVO CONTATTO*/
		int index = -1;
		do {
			System.out.print("Inserisci l'indice:");
			if (s.hasNextInt()) {
				
				index = s.nextInt();
			}
			else {
				s.next();
			}
		}
		while (index == -1);
		System.out.print("Inserisci il nome:");
		String nome = s.next();
		System.out.print("Inserisci il cognome: ");
		String cognome = s.next();
		System.out.print("Inserisci il numero: ");
		String numero = s.next();
		lista.modifyIndexArray(index, nome, cognome, numero);
	}
	
	public static void cancelArrayByIndex (Scanner s) {
		int index = -1;
		do {
			System.out.print("Inserisci l'indice: ");
			if(s.hasNextInt()) {
				index = s.nextInt();
			}
			else {
				s.next();
			}
		}
		while (index == -1);
		lista.cancellIndexArray(index);
	}
	
	public static void searchByName (Scanner s) {
		System.out.print("Inserisci il nome: ");
		String nome = s.next();
		System.out.print("Inserisci il cognome: ");
		String cognome = s.next();
		if (lista.searchNomeCognome(nome, cognome)) {
			System.out.println("Il nome è PRESENTE in archivio");
		}
		else {
			System.out.println("Il nome NON è presente in archivio");
		};
	}
}

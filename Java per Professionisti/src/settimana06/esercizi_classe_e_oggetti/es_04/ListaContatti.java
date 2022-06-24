package settimana06.esercizi_classe_e_oggetti.es_04;

public class ListaContatti {
	private Contatto[] contatti;
	private int maxArray;
	private int curArray;
	
	public ListaContatti(int maxArray) {
		this.maxArray = maxArray;
		contatti = new Contatto[maxArray];
		curArray = 0;
	}
	public void addContact(Contatto idContact) {
		if (curArray < maxArray) {
			contatti[curArray] = idContact;
			curArray++;
		}
		else {
			System.out.println("Errore: la lista è completa");
		}
	}
	
	public void showList() {
		for (int i = 0; i < curArray; i++) {
			//System.out.println(i+ " - " +contatti[i].getNome() + " " +contatti[i].getCognome() + " " +contatti[i].getNumTelefono());
			System.out.printf("%3d) %-15s%-15s%-20s%n", i, contatti[i].getNome(), contatti[i].getCognome(),contatti[i].getNumTelefono());
		}
	}
	
	public void modifyIndexArray (int index, String nome, String cognome, String numero) {
		if (index >=0 && index < curArray) {
			contatti[index].setNome(nome);
			contatti[index].setCognome(cognome);
			contatti[index].setNumTelefono(numero);
		}
		else {
			System.out.println("Il numero di indice non è valido.");
		}
	}
	
	public void cancellIndexArray (int index) {
		if (index >= 0 && index<curArray) {
			int delta = 0;
			for (int i = 0; i < curArray; i++) {
				if (i==index) {
					delta=1;
				}
				contatti[index].setNome(contatti[index+delta].getNome());
				contatti[index].setCognome(contatti[index+delta].getCognome());
				contatti[index].setNumTelefono(contatti[index+delta].getNumTelefono());
			}
			curArray --;
		}
		else {
			System.out.println("Il numero di indice non è valido.");
		}
	}
	
	public boolean searchNomeCognome (String nome, String cognome) {
		for (int i = 0; i < curArray; i++) {
			if (contatti[i].getNome().equals(nome) && contatti[i].getCognome().equals(cognome)) {
				return true;
			}
	
		}
		return false;
	}
}

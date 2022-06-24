package settimana07.testing;

public class TestPersone {

	
	public static void main(String[] args) {
		
		
		// Test classe Persona
		Persona p1 = new Persona();
		Persona p2 = new Persona("Mario", 20);
		
		
		/* getNome rende il nome della Persona: quando si richiama il 
		 * costruttore senza parametri il nome deve essere null.
		 * 
		 * getEta rende l'età della Persona.
		 */
		assert p1.getNome() == null;
		assert p2.getNome().equals("Mario"); // Ricorda che le stringhe sono oggetti, si confrontano con equals e non ==
		assert p2.getEta() == 20;
		
		
		// Test classe Lavoratore
		Lavoratore l1 = new Lavoratore("Giovanni", 40, 21, 86.5);
		Lavoratore l2 = new Lavoratore("Giovanni", 40, 21, 100.5);
		Lavoratore l3 = new Lavoratore();
		
		
		// Hai rispettato i vincoli sullo stipendio minimo?
		assert l1.getStipendio() == 100.0;
		assert l2.getStipendio() == 100.5;
		assert l3.getStipendio() == 100.0;
	
		
		/* guadagnoTotale indica il totale guadaganato da un lavoratore, 
		 * calcolato tramite il suo stipendio e gli anni di servizio.
		 * Il metodo suppone che lo stipendio sia rimasto invariato negli 
		 * anni e le mensilità versate siano sempre state 12. 
		 */
		assert l1.guadagnoTotale() == 25200.0;
		
		
		// Test classe Studente
		// Ci sono diversi modi per creare un array, li ricordi?
		String[] corsi1 = {"Calcolo differenziale e integrale", "Programmazione 2", "Automi e linguaggi formali"};
		int[] voti1 = new int[3];
		voti1[0] = 26; voti1[1] = 28; voti1[2] = 18;

		String[] corsi2 = {"Interazione uomo macchina", "Fondamenti di informatica"};
		int[] voti2 = {30, 30};
		
		Studente s1 = new Studente("Gianni", 22, 45046, corsi1, voti1);
		Studente s2 = new Studente("Franco", 25, 48241, corsi2, voti2);		
		
		// Che modifiche devi fare alla classe Studente per far funzionare i seguenti assert?
		assert s1.getNome() == "Gianni";
		assert s2.getEta() == 25;
		
		
		/* idoneoBorsaDiStudio rende un booleano che indica se lo studente è idoneo a ricevere
		 * la borsa di studio. Uno studente è idoneo se ha passato almeno 3 esami e la sua media è superiore a 27.
		 */
		assert s1.idoneoBorsaDiStudio() == false;
		assert s2.idoneoBorsaDiStudio() == false;
	}
	
}
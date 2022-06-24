package settimana06.esercizi_classe_e_oggetti.es_03;

public class Test {
	public static void main(String[] args) {
		Studente paffi = new Studente("Andrea","Paffi",34,27);
		Studente pippo = new Studente("aaa","bbb",12,30);
		Studente grande = new Studente("Grande","Grande",18,18);
		Studente test = new Studente("pippo", "pippo", 30, 28);
		Studente prova = new Studente ("test", "test", 29,29);
		
		ClasseStudente classeA = new ClasseStudente(4);
		
		classeA.aggiungiStudente(grande);
		classeA.aggiungiStudente(pippo);
		classeA.aggiungiStudente(paffi);
		classeA.aggiungiStudente(test);
		System.out.println("Mi aspetto un errore di classe completa:");
		classeA.aggiungiStudente(prova); /* Restituisce errore */
		
		System.out.println("Mi aspetto true:");
		System.out.println(classeA.queryStudente("Andrea", "Paffi"));
		
		System.out.println("Mi aspetto false:");
		System.out.println(classeA.queryStudente("Andrei", "Paffi"));
		
		System.out.println("Mi aspetto 2 perchè prova non è stato inserito:");
		System.out.println(classeA.queryEta());
		
		System.out.println("Mi aspetto 1: ");
		System.out.println(classeA.queryMedia());
		
	}

}

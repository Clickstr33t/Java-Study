package settimana08.acquisti;

import settimana08.acquisti.Broker;
import settimana08.acquisti.Cliente;
import settimana08.acquisti.Prodotto;
import settimana08.acquisti.Venditore;
import settimana08.acquisti.eccezioni.CreditoInsufficienteException;
import settimana08.acquisti.eccezioni.TroppiProdottiException;

public class TestAcquisti {

	public static void main(String[] args) {
	
		
		// Crea 6 prodotti: un prodotto ha un nome e un prezzo
		Prodotto pera = new Prodotto("Pera", 0.31);
		Prodotto banana = new Prodotto("Banana", 0.45); 
		Prodotto limone = new Prodotto("Limone", 0.35);
		Prodotto mela = new Prodotto("Mela molto buona", 0.75);
		Prodotto altraMela = new Prodotto("Mela acerba", 0.15);
		Prodotto pesca = new Prodotto("Pesca", 0.65);
		
		
		// Crea un venditore che può contenere un massimo di 5 prodotti
		Venditore fruttivendolo = new Venditore("Tonio", 5);
		
		
		// Inserisce 5 prodotti nel deposito del venditore
		fruttivendolo.aggiungi(pera);
		fruttivendolo.aggiungi(banana);
		fruttivendolo.aggiungi(limone);
		fruttivendolo.aggiungi(mela);
		fruttivendolo.aggiungi(altraMela);
		
		// Prova a inserire un sesto prodotto
		try {
			fruttivendolo.aggiungi(pesca); // Provoca il lancio dell'eccezione TroppiProdottiException
			
			assert false; // Se l'eccezione è stata gestita correttamente questa istruzione (che provoca il fallimento del test) non verrà mai eseguita.
			
			
		} catch (TroppiProdottiException e) {
			
			// Verifica che il messaggio di errore lanciato dall'eccezione sia corretto
			assert e.getMessage().equals("Errore: non è possibile inserire il prodotto Pesca perchè è stata raggiunta la dimensione massima del deposito."); 
		}
		
		
		// Confronto dei prodotti
		assert mela.equals(mela);			// Un oggetto è sempre uguale a se stesso
		assert !mela.equals(pera);			// Non mischiamo le mele con le pere!
		assert !mela.equals(altraMela); 	// In questo esercizio due prodotti sono uguali se hanno stesso nome e anche stesso prezzo
		
		
		// Stampa contenuto del venditore
		assert fruttivendolo.toString().equals("[(Pera, 0.31), (Banana, 0.45), (Limone, 0.35), (Mela molto buona, 0.75), (Mela acerba, 0.15)]");
		
		
		// Crea un nuovo cliente con nome, bilancio disponibile e numero massimo di prodotti acquistabili
		Cliente cliente = new Cliente("Mario", 1.0, 2);
		
		
		// Crea un borker
		Broker broker = new Broker();
		
		
		// Il broker gestisce l'acquisto della mala da parte del cliente
		broker.scambia(fruttivendolo, cliente, mela);
		
		try {
			
			broker.scambia(fruttivendolo, cliente, limone);		// Provoca il lancio dell'eccezione CreditoInsufficienteException 
			assert false;
			
		} catch(CreditoInsufficienteException e) {
			assert e.getMessage().equals("Mario non possiede soldi a sufficienza per acquistare Limone al prezzo di 0.35 dal venditore Tonio");
		}
		
		System.out.println("Test concluso!");
	}
}
package settimana08.esercizi.es_04corretto;

public class Test {

	public static void main(String[] args) {
		
		// Creazione account Facebook e Twitter di Mario
		FacebookAccount marioFB;
		marioFB = new FacebookAccount("Mario", "oiraM");
		
		TwitterAccount marioTW;
		marioTW = new TwitterAccount("Mario", "oiraM");
		
		// Facebook
		marioFB.login("Mario", "oiraM");
		marioFB.addPost("Ciao da Facebook!");
		marioFB.addPost("Questo è il mio secondo post su Facebook");
		marioFB.printAllPosts();
		marioFB.logout();
		
		// Twitter
		marioTW.login("Mario", "oiraM");
		marioTW.addPost("Ciao da Twitter!");

		// Rimuovi il commento dalla prossima istruzione per 
		// testare l'eccezione sui tweet troppo lunghi
		//marioTW.addPost("Questo tweet è davvero troppo lungo");

		marioTW.printAllPosts();
		marioTW.logout();
	}
}

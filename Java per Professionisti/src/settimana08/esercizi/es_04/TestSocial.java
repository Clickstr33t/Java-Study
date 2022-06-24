package settimana08.esercizi.es_04;

public class TestSocial {
	public static void main(String[] args) {
		FacebookAccount andreaPaffi = new FacebookAccount("Andrea123", "Fontana");
		
		andreaPaffi.login("Andrea123", "Fontana");
		andreaPaffi.addPost("Che Bella gioranta");
		andreaPaffi.addPost("Giornata di merda");
		andreaPaffi.logout();
		//andreaPaffi.addPost("Evviva");  //Lancia un eccezione login
		
		TwitterAccount valerioDidomenico = new TwitterAccount("Andrea123", "Fontana");
		valerioDidomenico.login("Andrea123", "Fontana");
		andreaPaffi.login("Andrea123", "Fontana");
		andreaPaffi.addPost("FontaMerda FontaMerda FontaMerda FontaMerda FontaMerda "
				+ "FontaMerda FontaMerda FontaMerda FontaMerda FontaMerda FontaMerdaFontaMerda"
				+ "FontaMerda FontaMerda FontaMerda FontaMerda FontaMerda FontaMerda FontaMerda"
				+ "FontaMerda FontaMerdaFontaMerda FontaMerda FontaMerda FontaMerda FontaMerda"
				+ "FontaMerda FontaMerda FontaMerda FontaMerda FontaMerda FontaMerda");
		
		
		
		/* 
		 		andreaPaffi.addPost("FontaMerda FontaMerda FontaMerda FontaMerda FontaMerda "
				+ "FontaMerda FontaMerda FontaMerda FontaMerda FontaMerda FontaMerdaFontaMerda"
				+ "FontaMerda FontaMerda FontaMerda FontaMerda FontaMerda FontaMerda FontaMerda"
				+ "FontaMerda FontaMerdaFontaMerda FontaMerda FontaMerda FontaMerda FontaMerda"
				+ "FontaMerda FontaMerda FontaMerda FontaMerda FontaMerda FontaMerda");
		LANCIA L'ECCEZIONE PERCHE' MAGGIORE DI 280 CARATTERU */
	}
}

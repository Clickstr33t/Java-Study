package settimana08.esercizi.es_04;

import settimana08.esercizi.es_04.classiAstratte.SocialMediaAccount;
import settimana08.esercizi.es_04.eccezioni.StringLongException;

public class TwitterAccount extends SocialMediaAccount{

	public TwitterAccount(String user, String password) {
		super(user, password);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addPost(String post) {
		
		// Controllo limite 280 caratteri per post;
		if (post.length()>280) {
			throw new StringLongException();
		}
		super.addPost(post);
	}
	
	

}

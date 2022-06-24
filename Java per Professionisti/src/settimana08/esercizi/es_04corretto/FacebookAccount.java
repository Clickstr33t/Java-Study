package settimana08.esercizi.es_04corretto;

/**
 * In questo esempio, un account Facebook permette di 
 * gestire un massimo di 10 post.
 *
 */
public class FacebookAccount extends SocialMediaAccount{

	private static final int MAX_POSTS = 10;
	
	public FacebookAccount(String username, String password) {
		super(username, password, MAX_POSTS);
	}
}

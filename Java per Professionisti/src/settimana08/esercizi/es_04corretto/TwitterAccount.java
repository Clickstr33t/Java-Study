package settimana08.esercizi.es_04corretto;

/**
 * Su Twitter un post può essere lungo massimo 280 caratteri, 
 * se l'utente passa una stringa più grande viene lanciata 
 * una RuntimeException che comunica il problema.
 */
public class TwitterAccount extends SocialMediaAccount{

	private static final int MAX_POSTS = 20;
	
	// Semplifichiamo il test riducendo i 280 caratteri a soli 30
	private static final int TWEET_SIZE = 30; 
	
	public TwitterAccount(String username, String password) {
		super(username, password, MAX_POSTS);
	}

	@Override
	public boolean addPost(String post) {
		if(post.length() > TWEET_SIZE)
			throw new RuntimeException("Superata lunghezza massima post (" + TWEET_SIZE + ")");
		
		return super.addPost(post);
	}
}

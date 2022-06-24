package settimana08.esercizi.es_04corretto;
import java.util.ArrayList;
import java.util.List;

/**
 * Un account social media è composto da user, password, 
 * un parametro booleano che indica se l'utente è attualmente loggato 
 * e una bacheca contenente una lista di post.
 *
 * Quando l'utente è loggato, è possibile aggiungere nuovi post (addPost) 
 * o leggere tutti i post presenti (printAllPosts).
 * 
 * La gestione del login dell'utente è svolta implementando i metodi
 * dell'interfaccia Session.
 * 
 * La classe è astratta, quindi anche se è possibile creare oggetti di
 * tipo SocialMediaAccount, possono essere istanziati solo con una classe
 * non astratta che estende SocialMediaAccount.
 */
public abstract class SocialMediaAccount implements Session{

	private String username;
	private String password;
	private boolean session;
	
	/*
	 * Wall è la bacheca dei post: possiamo gestirla con un
	 * Array di Stringhe o con una Collection (List, Set, ...).
	 * Utilizziamo una lista di Stringhe.
	 */
	private List<String> wall;
	private int curSize;
	private int maxSize;
	
	
	public SocialMediaAccount(String username, String password, int maxSize) {
		this.username = username;
		this.password = password;
		this.maxSize = maxSize;
		
		/* 
		 * List è un'interfaccia, non ha costruttori,
		 * dobbiamo utilizzare una classe che implementa
		 * l'interfaccia, ad esempio ArrayList.
		 */
		wall = new ArrayList<>();
	}

	
	public boolean addPost(String post) {
		if(session && curSize < maxSize) {
			wall.add(post); // Utilizziamo i metodi di List
			curSize ++;
			return true;
		}
		
		return false;
	}
	
	public void printAllPosts() {
		/*
		 * In alternativa al ciclo for utilizzato sotto,
		 * si può utilizzare una struttura for-each 
		 */
		for(int i=0; i<curSize; i++) {
			System.out.println(wall.get(i));
		}
	}
	
	@Override
	public boolean login(String username, String password) {
		if(this.username.equals(username) &&
		   this.password.equals(password)) {
			this.session = true;
			return true;
		}
		
		return false;
	}
	
	@Override
	public void logout() {
		this.session = false;
	}
}
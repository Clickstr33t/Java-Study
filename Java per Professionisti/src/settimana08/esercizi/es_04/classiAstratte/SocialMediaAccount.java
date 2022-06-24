package settimana08.esercizi.es_04.classiAstratte;

import settimana08.esercizi.es_04.eccezioni.LoginException;
import settimana08.esercizi.es_04.interfacce.Session;

public abstract class SocialMediaAccount implements Session {
	
	private String user;
	private String password;
	private boolean login;
	private String[] bacheca;
	private int currentPost = 0;
	final int  WIDTHBACHECA = 10;
	
	
	public SocialMediaAccount(String user, String password) {
		this.user = user;
		this.password = password;
		this.login = false;
		this.bacheca = new String[WIDTHBACHECA];
	}
	
	public void addPost(String post) {
		if (!this.login) {
			throw new LoginException();
		}
		
		this.bacheca[currentPost] = post;
		currentPost++;
	}
	
	@Override
	public boolean login(String user, String password) {
		if (user == this.user && password == this.password) {
			this.login = true;
			return this.login;
		} else {
			this.login = false;
			return this.login;
		}
	}

	@Override
	public void logout() {
		this.login = false;
	}
}
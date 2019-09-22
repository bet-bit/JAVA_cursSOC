package practica;

public class Clients implements Salutacio {

	private String nom;
	private String mail;
	private String tipus;
	
	// constructor
	public Clients(String nom, String mail, String tps) {
		this.nom = nom;
		this.mail = mail;
		this.tipus=tps;
	}
	// getters i setters
	
	public String getNom() {
		return this.nom;
	}

	public String getMail() {
		return this.mail;
	}	

	public String getTipus() {
		return this.tipus;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setMail(String email) {
		this.mail = email;
	}
	
	public void setTipus(String tps) {
		this.tipus = tps;
	}
	
	// others
	
	public void saludar() {
		System.out.println("Hi there client");
	}
	
}

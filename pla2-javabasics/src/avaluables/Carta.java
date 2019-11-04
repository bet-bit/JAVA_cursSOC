package avaluables;

public class Carta {
	
	public Carta(String pal, int valor, String nom) {
		this.pal = pal;
		this.valor = valor;
		this.nom = nom;
	}

	private String pal;
	private int valor;
	private String nom;
	
	
	@Override
	public String toString() {
		return valor+" de "+ pal;
	}


	public String getPal() {
		return pal;
	}


	public void setPal(String pal) {
		this.pal = pal;
	}


	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}
	

}

package avaluables;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
	
	public Jugador(String nom) {
		this.nom = nom;
		this.cartes = new ArrayList<Carta>();
	}


	private String nom;
	private List<Carta> cartes = new ArrayList<Carta>();

	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public void donarCarta(Carta carta) {
		this.cartes.add(carta);
	}

	public Carta retirarCarta(int index) {
		this.cartes.remove(index);
		return cartes.get(index);
	}

	public String joc() {
		String joc = cartes.toString();
		return joc;
	}
}

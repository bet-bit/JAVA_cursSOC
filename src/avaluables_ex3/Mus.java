package avaluables_ex3;

import java.util.ArrayList;
import java.util.List;

import avaluables.Carta;
import avaluables.Jugador;
import avaluables_ex2.Espanyola;

public class Mus {
	
	private Espanyola baralla = new Espanyola();
	private List<Jugador> jugadors = new ArrayList<Jugador>();

	public void addJugador(Jugador j) {
		jugadors.add(j);
	}

	public List<Jugador> getJugadors() {
		return jugadors;
	}

	public void setJugadors(List<Jugador> jugadors) {
		this.jugadors = jugadors;
	}

}

package avaluables_ex3;

import java.util.ArrayList;
import java.util.List;

import avaluables.Jugador;
import avaluables_ex2.Francesa;

public class Poker {
	
	private Francesa baralla = new Francesa();
	private List<Jugador> jugadors = new ArrayList<Jugador>();

	public Poker(ArrayList<Jugador> js) {
		if (js.size() >= 2) this.jugadors = js;
		else {
			System.out.println("hi ha hagut un error en la inicialització, la llista ha de contenir almenys 2 jugadors");
			System.exit(0);
		}
		this.baralla = new Francesa();
	}
	
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
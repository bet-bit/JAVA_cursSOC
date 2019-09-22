package avaluables_ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import avaluables.Carta;

abstract class Baralla {
	private String nom;
	protected List<Carta> cartes = new ArrayList<Carta>();

	void barrejar() {
		Collections.shuffle(this.cartes);
	}

	Carta repartir() {
		Carta carta1 = this.cartes.get(0);
		cartes.remove(0);
		return carta1;
	}

	abstract void reiniciar();
}

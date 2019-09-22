package avaluables_ex2;
import avaluables.Carta;

public class Espanyola extends Baralla{
	
	public Espanyola() {
		this.reiniciar();
	}
	
	String[] pals = {"espases", "bastos", "oros", "copes"};
	String[] noms = {"1","2","3","4","5","6","7","sota","cavall","rei"};
	int[] valors = {1,2,3,4,5,6,7,10,11,12};
	
	void reiniciar() {
		if (this.cartes.size() > 0) {
			this.cartes.clear();
		}
		
		for (int i=0; i<pals.length; i++) {
			for(int j=0; j<valors.length; j++) {
				Carta carta = new Carta(pals[i],valors[j],noms[j]);
				cartes.add(carta);
			}
		}
	}

}

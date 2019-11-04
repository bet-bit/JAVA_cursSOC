package avaluables_ex2;
import avaluables.*;

public class Francesa extends Baralla{
	
	public Francesa() {
		this.reiniciar();
	}
	
	String[] pals = {"piques", "trèvols", "diamants", "cors"};
	String[] noms = {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
	int[] valors = {1,2,3,4,5,6,7,8,9,10,11,12,13};
	
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

package practica;

public class Gerent extends Treballador implements Salutacio {

	String departament;
	public int dietes=1;
	
	public Gerent(String nom, String id) {
		super(nom, id);
	}
	
	public double souNet() {
		return this.getIRPF()*this.getSou()+this.dietes;
	}

}

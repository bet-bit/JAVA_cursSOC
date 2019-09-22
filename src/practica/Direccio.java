package practica;

public class Direccio extends Treballador implements Salutacio {
	
	int StockOptions=10;
	
	public Direccio(String nom, String id) {
		super(nom, id);
	}

	public double souNet() {
		return this.getIRPF()*this.getSou()+this.StockOptions;
		
	}
	
	public void saludar() {
		System.out.println("Hi there worker. En part sóc un més, però que quedi clar qui mana!");
	}
}

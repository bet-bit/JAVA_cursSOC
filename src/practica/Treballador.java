package practica;
public class Treballador implements Salutacio {
	private String name;
	private String dni;
	private double sou;
	
	// constructor
	public Treballador(String nom, String id) {
		this.name = nom;
		this.dni = id;
	}
	// getters i setters
	
	public String getName() {
		return this.name;
	}

	public String getDni() {
		return this.dni;
	}	

	public double getSou() {
		return this.sou;
	}
	
	public void setName(String nom) {
		this.name = nom;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public void setSou(double sou) {
		this.sou = sou;
	}
	
	// other methods
	
	public void saludar() {
		System.out.println("Hi there worker");
	}
	
	public double souNet() {
		return this.getIRPF()*this.sou;
	}
	
	protected double getIRPF() {
		if (this.sou < 3000.0) {
			return 0.85;
		}
		else return 0.75;
	}
}
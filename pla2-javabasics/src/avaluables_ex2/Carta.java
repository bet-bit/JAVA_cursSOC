package avaluables_ex2;

public class Carta {
	
	public Carta(String pal, String valor) {
		this.pal = pal;
		this.valor = valor;
	}

	private String pal;
	private String valor;
	
	
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


	public String getValor() {
		return valor;
	}


	public void setValor(String valor) {
		this.valor = valor;
	}

}

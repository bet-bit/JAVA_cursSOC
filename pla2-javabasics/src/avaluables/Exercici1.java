package avaluables;

public class Exercici1 {
	public static void main(String[] args) {
		Jugador j1 = new Jugador("Pep");
		Carta c1 = new Carta("bastos",1,"1");
		j1.donarCarta(c1);
		Carta c2 = new Carta("bastos",2,"2");
		j1.donarCarta(c2);
		System.out.println("Joc del "+j1.getNom()+": "+j1.joc());
	
		}
}

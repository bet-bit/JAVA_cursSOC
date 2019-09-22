package avaluables_ex4;

import java.util.Scanner;

import avaluables.Carta;
import avaluables.Jugador;
import avaluables_ex3.Mus;

public class PlayMus {

	public static void main(String[] args) {
		
	    System.out.println("Entra el nom dels 4 jugadors (\"Enter\" per passar al següent) :");
	    
	    Scanner dd = new Scanner(System.in);
	    String[] jugadors = new String[4];

	    for(int i = 0; i < jugadors.length; i++) {
	      System.out.println("Entra el jugador "+(i+1)+":");
	      jugadors[i] = dd.nextLine();
	    }
	    System.out.println("Geacès");
	    
	    Mus eljoc = new Mus();
	    for(int i = 0; i < jugadors.length; i++) {
		      eljoc.addJugador(new Jugador(jugadors[i]));
		    }
	    
	    System.out.println("Començarem una partida de mus amb els jugadors:");
		for (Jugador jug : eljoc.getJugadors()) {
			  System.out.println(jug.getNom());
		}
	}
}

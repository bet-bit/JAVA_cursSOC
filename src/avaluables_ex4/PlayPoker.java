package avaluables_ex4;

import java.util.ArrayList;
import java.util.Scanner;

import avaluables.Carta;
import avaluables.Jugador;
import avaluables_ex3.Poker;

public class PlayPoker {
	public static void main(String[] args) {
		
	    System.out.println("De quants jugadors serà la partida?");

	    Scanner jj = new Scanner(System.in);
	    int nombre = jj.nextInt();
	    
	    Scanner dd = new Scanner(System.in);
	    ArrayList<Jugador> jugadors = new ArrayList<Jugador>();;
	    
	    String nom;
	    for(int i = 0; i < nombre; i++) {
	      System.out.println("Entra el nom del jugador "+(i+1)+":");
	      nom = dd.nextLine();
	      jugadors.add(new Jugador(nom)); 
	    }

	    Poker eljoc = new Poker(jugadors);
	    System.out.println("Començarem una partida de Poker amb els jugadors:");
		for (Jugador jug : eljoc.getJugadors()) {
			  System.out.println(jug.getNom());
			}
	}
	
}

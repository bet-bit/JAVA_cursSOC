package com.pla5.exercici;

import java.util.ArrayList;

public class Codificador {

	private IProcessar processar;
	private ICodificar codificar;
	
	public Codificador(IProcessar processar, ICodificar codificar){
		this.processar=processar;
		this.codificar=codificar;
	}
	
	public String codificar(String cadena) {
		ArrayList<String> dividida = new ArrayList<String>();
		dividida = processar.dividir(cadena);

		
		for (int i=0;  i < dividida.size();  i++ ) {
			dividida.set(i, codificar.codificar(dividida.get(i)));
		}
		
		String cadenaFinal = processar.unir(dividida);
		return cadenaFinal;
	}

	public String descodificar(String cadena) {
		ArrayList<String> dividida = new ArrayList<String>();
		dividida = processar.dividir(cadena);

		
		for (int i=0;  i < dividida.size();  i++ ) {
			dividida.set(i, codificar.descodificar(dividida.get(i)));
		}
		
		String cadenaFinal = processar.unir(dividida);
		return cadenaFinal;
	}

}

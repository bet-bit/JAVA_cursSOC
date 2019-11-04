package com.pla5.exercici;

public class Invertir implements ICodificar {

	public String codificar(String cadena) {
        StringBuilder cadenaSB = new StringBuilder(); 
        cadenaSB.append(cadena); 
        cadenaSB = cadenaSB.reverse(); 
        return cadenaSB.toString(); 
	}

	public String descodificar(String cadena) {
		return this.codificar(cadena);
	}

}

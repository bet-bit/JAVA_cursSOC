package com.pla5.exercici;

import java.util.*;

public class Paraules implements IProcessar {

	public ArrayList<String> dividir(String cadena){
		
		ArrayList<String> dividida = new ArrayList<>(Arrays.asList(cadena.split(" ")));
		return dividida;
	}

	
	public String unir(ArrayList<String> cadenes) {
		
		String unida = "";
		for (int i=0;  i < cadenes.size();  i++ ) {
			unida = unida + " " + cadenes.get(i);			
		}
        return unida.substring(1, unida.length());
	}

}

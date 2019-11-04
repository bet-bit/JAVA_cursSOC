package com.pla5.exercici;

import java.util.*;

public class Blocs implements IProcessar {

	public ArrayList<String> dividir(String cadena){
	
		ArrayList<String> dividida = new ArrayList<>();
		for (int j=0; j<cadena.length()/4; j++) {
			dividida.add(cadena.substring(j * 4, Math.min((j + 1) * 4, cadena.length())));
			}
			
			return dividida;
	}
		
	public String unir(ArrayList<String> cadenes) {
		String unida = "";
		for (int i=0;  i < cadenes.size();  i++ )
        	unida += cadenes.get(i);
        
		return unida;
	}
}